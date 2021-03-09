import StringClassPackege.Strclass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class StrclassTest {

        @Test
        public void stringToUpCaseTesting()
        {
            var msc = new Strclass();
            var res = Strclass.stringToUpCase("вторая лабораторная работа");
            Assert.assertEquals(res,"ВТОРАЯ ЛАБОРАТОРНАЯ РАБОТА");
        }
        @Test
        public void stringToLowCaseTesting()
        {
            var msc = new Strclass();
            var res = Strclass.stringToLowCase("MY NAME IS LIZA");
            Assert.assertEquals(res, "my name is liza");
        }
        @Test
        public void stringLenTesting()
        {
            var msc = new Strclass();
            int res = Strclass.stringLen("Три метра над уровнем неба");
            Assert.assertEquals(res, 26);
        }
        @Test
        public void stringUnionTesting()
        {
            var msc = new Strclass();
            var res = Strclass.stringUnion("Мой мир ", "не будет прежним");
            Assert.assertEquals(res, "Мой мир не будет прежним");
        }
    }

