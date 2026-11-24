.class public final La/stn;
.super La/kc5;
.source "SourceFile"


# static fields
.field public static final l:La/stn;

.field public static final m:La/qaj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/stn;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/stn;->l:La/stn;

    .line 7
    .line 8
    sget-object v0, La/qhi0;->a:La/qaj;

    .line 9
    .line 10
    sput-object v0, La/stn;->m:La/qaj;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()La/qaj;
    .locals 0

    .line 1
    sget-object p0, La/stn;->m:La/qaj;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(La/ugi0;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, -0x1

    return p0
.end method
