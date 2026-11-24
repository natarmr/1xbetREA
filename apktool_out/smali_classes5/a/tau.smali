.class public final La/tau;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public synthetic i:Z

.field public synthetic j:Ljava/lang/String;

.field public final synthetic k:La/uau;

.field public final synthetic l:La/sff0;

.field public final synthetic m:Ljava/util/ArrayList;

.field public final synthetic n:La/a8z;


# direct methods
.method public constructor <init>(La/uau;La/sff0;Ljava/util/ArrayList;La/a8z;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tau;->k:La/uau;

    .line 2
    .line 3
    iput-object p2, p0, La/tau;->l:La/sff0;

    .line 4
    .line 5
    iput-object p3, p0, La/tau;->m:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p4, p0, La/tau;->n:La/a8z;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    move-object v5, p3

    .line 10
    check-cast v5, La/yje;

    .line 11
    .line 12
    new-instance v0, La/tau;

    .line 13
    .line 14
    iget-object v3, p0, La/tau;->m:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v4, p0, La/tau;->n:La/a8z;

    .line 17
    .line 18
    iget-object v1, p0, La/tau;->k:La/uau;

    .line 19
    .line 20
    iget-object v2, p0, La/tau;->l:La/sff0;

    .line 21
    .line 22
    invoke-direct/range {v0 .. v5}, La/tau;-><init>(La/uau;La/sff0;Ljava/util/ArrayList;La/a8z;La/yje;)V

    .line 23
    .line 24
    .line 25
    iput-boolean p1, v0, La/tau;->i:Z

    .line 26
    .line 27
    iput-object p2, v0, La/tau;->j:Ljava/lang/String;

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, La/tau;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, La/tau;->i:Z

    .line 2
    .line 3
    iget-object v1, p0, La/tau;->j:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/tau;->m:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, La/tau;->k:La/uau;

    .line 15
    .line 16
    iget-object v0, v0, La/uau;->n:La/r9u;

    .line 17
    .line 18
    sget-object v2, La/ygp;->f:La/ygp;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, La/tau;->n:La/a8z;

    .line 37
    .line 38
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/util/List;

    .line 43
    .line 44
    iget-object p0, p0, La/tau;->l:La/sff0;

    .line 45
    .line 46
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 47
    .line 48
    iget-object p0, p0, La/mum0;->f:La/ay10;

    .line 49
    .line 50
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    new-instance p0, La/jx10;

    .line 57
    .line 58
    sget-object v0, La/iz30;->a:La/htz;

    .line 59
    .line 60
    invoke-direct {p0, v1}, La/jx10;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_0
    return-object p1
.end method
