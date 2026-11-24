.class public final synthetic La/dey;
.super La/ez40;
.source "SourceFile"


# static fields
.field public static final b:La/dey;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/dey;

    .line 2
    .line 3
    const-string v1, "getJvmFlags(Lkotlin/metadata/KmProperty;)I"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-class v3, La/eey;

    .line 7
    .line 8
    const-string v4, "jvmFlags"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/dey;->b:La/dey;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/dqy;

    .line 2
    .line 3
    sget-object p0, La/eey;->a:[La/iiy;

    .line 4
    .line 5
    invoke-static {p1}, La/j0x;->v(La/dqy;)La/nfy;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, La/nfy;->a:I

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/dqy;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sget-object p2, La/eey;->a:[La/iiy;

    .line 10
    .line 11
    invoke-static {p1}, La/j0x;->v(La/dqy;)La/nfy;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput p0, p1, La/nfy;->a:I

    .line 16
    .line 17
    return-void
.end method
