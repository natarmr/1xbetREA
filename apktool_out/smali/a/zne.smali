.class public final La/zne;
.super La/lne;
.source "SourceFile"


# static fields
.field public static final c:La/zne;

.field public static final d:La/rwj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/zne;

    .line 2
    .line 3
    invoke-direct {v0}, La/lne;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/zne;->c:La/zne;

    .line 7
    .line 8
    sget-object v0, La/tvk;->a:La/rwj;

    .line 9
    .line 10
    sput-object v0, La/zne;->d:La/rwj;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final v(Lkotlin/coroutines/CoroutineContext;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/zne;->d:La/rwj;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    xor-int/lit8 p0, p0, 0x1

    .line 11
    .line 12
    return p0
.end method
