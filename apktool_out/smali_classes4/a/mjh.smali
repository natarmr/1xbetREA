.class public final La/mjh;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mjh;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/std",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Q1:La/std;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/fiu0;

.field public final M1:La/a8z;

.field public final N1:La/s0r;

.field public final O1:La/a8z;

.field public final P1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mjh;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/mjh;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/std;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/mjh;->Q1:La/std;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b22

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/mjh;->K1:La/e9o0;

    .line 21
    .line 22
    const-class v0, La/lmh;

    .line 23
    .line 24
    sget-object v1, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/kjh;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v2}, La/kjh;-><init>(La/mjh;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/mjh;->M1:La/a8z;

    .line 41
    .line 42
    sget-object v0, La/ljh;->a:La/ljh;

    .line 43
    .line 44
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/mjh;->N1:La/s0r;

    .line 49
    .line 50
    new-instance v0, La/kjh;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, p0, v1}, La/kjh;-><init>(La/mjh;B)V

    .line 54
    .line 55
    .line 56
    sget-object v1, La/wez;->b:La/wez;

    .line 57
    .line 58
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/mjh;->O1:La/a8z;

    .line 63
    .line 64
    new-instance v0, La/khf0;

    .line 65
    .line 66
    const-string v1, "TOURNAMENT_BRACKET_FEED_ID"

    .line 67
    .line 68
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, La/mjh;->P1:La/khf0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/mjh;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/xei;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/lmh;

    .line 12
    .line 13
    iget-object v0, v0, La/xei;->i:La/uci;

    .line 14
    .line 15
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/mjh;->L1:La/fiu0;

    .line 23
    .line 24
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    sget-object v0, La/mjh;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mjh;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/aid;

    .line 16
    .line 17
    iget-object v0, v0, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/owp0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/yfg;

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    invoke-direct {v2, p0, v3}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    new-instance p0, La/ugd;

    .line 31
    .line 32
    const v3, 0x3dad2128

    .line 33
    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v0, v1, v2, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mjh;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
