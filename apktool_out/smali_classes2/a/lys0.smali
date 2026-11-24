.class public abstract La/lys0;
.super La/vzs0;
.source "SourceFile"


# static fields
.field public static final b:La/kys0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/kys0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/kys0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/lys0;->b:La/kys0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final d(La/wsy;)La/pzs0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, La/wsy;->S()La/iys0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, La/lys0;->g(La/iys0;)La/pzs0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public abstract g(La/iys0;)La/pzs0;
.end method
