package community;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationPropertiesTest {
	
	@Autowired
	FruitProperty fruitProperty;
	FruitPropertyMap fruitPropertyMap;
	
	@Test
	public void test() {
		List<Map> fruitDataMap = fruitPropertyMap.getList();

		assertThat(fruitDataMap.get(0).get("name"), is("banana"));
		assertThat(fruitDataMap.get(0).get("color"), is("yellow"));
		
		assertThat(fruitDataMap.get(1).get("name"), is("apple"));
		assertThat(fruitDataMap.get(1).get("color"), is("red"));
		
		assertThat(fruitDataMap.get(2).get("name"), is("water melon"));
		assertThat(fruitDataMap.get(2).get("color"), is("green"));
		
		List<Fruit> fruitData = fruitProperty.getList();
		
		assertThat(fruitData.get(0).getName(), is("banana"));
		assertThat(fruitData.get(0).getColor(), is("yellow"));
		
		assertThat(fruitData.get(1).getName(), is("apple"));
		assertThat(fruitData.get(1).getColor(), is("red"));
		
		assertThat(fruitData.get(2).getName(), is("water melon"));
		assertThat(fruitData.get(2).getColor(), is("green"));
	}
}
