package com.company;

import java.util.LinkedList;

public class Backpack {
    LinkedList<String> Backpacks = new LinkedList<>();
    Round tennisboll = new Tennisboll();
    Round apple = new Apple();
    Cylindrical cola = new Cola();
    Cylindrical water = new Water();
    Flat book = new Book();
    Flat folder = new Folder();

}

package com.company;

public class Folder implements Flat {
}
package com.company;

public class Tennisboll implements Round {
}
package com.company;

public interface Round {
}
package com.company;

public class Apple implements Round {
}
package com.company;

public class Water implements Cylindrical {
}
package com.company;

public interface Cylindrical {
}
package com.company;

public class Cola implements Cylindrical {
}
package com.company;

public class Book implements Flat {
}
