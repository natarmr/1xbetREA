.class public abstract La/swq0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[La/iiy;

.field public static final b:La/zai0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/swq0;

    .line 4
    .line 5
    const-string v2, "designInfoProvider"

    .line 6
    .line 7
    const-string v3, "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/sre0;->a:La/tre0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, La/tre0;->e(La/dz40;)La/thy;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-array v1, v4, [La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    sput-object v1, La/swq0;->a:[La/iiy;

    .line 25
    .line 26
    new-instance v0, La/zai0;

    .line 27
    .line 28
    const-string v1, "DesignInfoProvider"

    .line 29
    .line 30
    invoke-direct {v0, v1}, La/zai0;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, La/swq0;->b:La/zai0;

    .line 34
    .line 35
    return-void
.end method

.method public static final a(La/abi0;La/bk30;)V
    .locals 2

    .line 1
    sget-object v0, La/swq0;->a:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    sget-object v0, La/swq0;->b:La/zai0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0, p1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
