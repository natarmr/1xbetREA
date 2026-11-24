.class public final La/zwj;
.super La/hre0;
.source "SourceFile"


# instance fields
.field public final a:La/ire0;


# direct methods
.method public constructor <init>(La/ire0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/hre0;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zwj;->a:La/ire0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c()La/dre0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zwj;->a:La/ire0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, La/uhy;

    .line 7
    .line 8
    invoke-interface {p0}, La/uhy;->e()La/phy;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/dre0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final p()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/zwj;->a:La/ire0;

    .line 2
    .line 3
    invoke-interface {p0}, La/qgy;->getReturnType()La/kiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
