.class public final La/l69;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ky90;


# instance fields
.field public final synthetic a:La/cgk0;

.field public final synthetic b:La/dfu0;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;


# direct methods
.method public constructor <init>(La/cgk0;La/dfu0;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/l69;->a:La/cgk0;

    .line 5
    .line 6
    iput-object p2, p0, La/l69;->b:La/dfu0;

    .line 7
    .line 8
    iput-object p3, p0, La/l69;->c:La/pz40;

    .line 9
    .line 10
    iput-object p4, p0, La/l69;->d:La/pz40;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final G(La/dlo;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p1, La/dlo;->a:I

    .line 5
    .line 6
    sget-object v0, La/xx90;->a:Ljava/util/Set;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, La/l69;->c:La/pz40;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, La/l69;->b:La/dfu0;

    .line 22
    .line 23
    iput v2, p1, La/dfu0;->a:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-interface {v1, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/l69;->d:La/pz40;

    .line 30
    .line 31
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p0, La/ay90;

    .line 42
    .line 43
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/ay90;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget v0, v0, La/ay90;->a:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v0, v2

    .line 55
    :goto_0
    const/4 v3, 0x1

    .line 56
    add-int/2addr v0, v3

    .line 57
    const/16 v4, 0x3ea

    .line 58
    .line 59
    if-ne p1, v4, :cond_2

    .line 60
    .line 61
    move v2, v3

    .line 62
    :cond_2
    invoke-direct {p0, v0, v2}, La/ay90;-><init>(IZ)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final f(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/l69;->a:La/cgk0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/cgk0;->m(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
