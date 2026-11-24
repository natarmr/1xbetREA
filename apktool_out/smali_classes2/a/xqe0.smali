.class public final La/xqe0;
.super La/zqe0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:La/iun;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xqe0;->a:Ljava/lang/Class;

    .line 5
    .line 6
    sget-object p1, La/iun;->a:La/iun;

    .line 7
    .line 8
    iput-object p1, p0, La/xqe0;->b:La/iun;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, La/xqe0;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/xqe0;->b:La/iun;

    .line 2
    .line 3
    return-object p0
.end method
