.class public final La/xgy;
.super La/ihy;
.source "SourceFile"

# interfaces
.implements La/kry;
.implements La/sgy;
.implements La/oiy;
.implements La/jys0;


# static fields
.field public static final d:Ljava/util/HashSet;


# instance fields
.field public final b:Ljava/lang/Class;

.field public final c:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/kxk0;->a:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, La/qlc;

    .line 23
    .line 24
    invoke-virtual {v2}, La/qlc;->a()La/swq;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v2, v2, La/swq;->a:La/twq;

    .line 29
    .line 30
    invoke-virtual {v2}, La/twq;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sput-object v1, La/xgy;->d:Ljava/util/HashSet;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xgy;->b:Ljava/lang/Class;

    .line 5
    .line 6
    sget-object p1, La/wez;->a:La/wez;

    .line 7
    .line 8
    new-instance v0, La/tgy;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, La/tgy;-><init>(La/xgy;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/xgy;->c:La/a8z;

    .line 19
    .line 20
    return-void
.end method

.method public static T(La/qlc;La/pog0;)La/llc;
    .locals 7

    .line 1
    new-instance v0, La/llc;

    .line 2
    .line 3
    new-instance v1, La/nun;

    .line 4
    .line 5
    iget-object p1, p1, La/pog0;->a:La/f6i;

    .line 6
    .line 7
    iget-object v2, p1, La/f6i;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/ym40;

    .line 10
    .line 11
    iget-object v3, p0, La/qlc;->a:La/swq;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v1, v2, v3, v4}, La/nun;-><init>(La/ym40;La/swq;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/qlc;->f()La/g950;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, La/gm40;->b:La/gm40;

    .line 22
    .line 23
    sget-object v4, La/slc;->a:La/slc;

    .line 24
    .line 25
    iget-object p0, p1, La/f6i;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/ym40;

    .line 28
    .line 29
    invoke-interface {p0}, La/ym40;->c()La/ary;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v5, "Any"

    .line 34
    .line 35
    invoke-virtual {p0, v5}, La/ary;->k(Ljava/lang/String;)La/wm40;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, La/wm40;->I()La/kzj0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object p0, p1, La/f6i;->e:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v6, p0

    .line 50
    check-cast v6, La/eu00;

    .line 51
    .line 52
    invoke-direct/range {v0 .. v6}, La/llc;-><init>(La/vjj;La/g950;La/gm40;La/slc;Ljava/util/List;La/eu00;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ker;

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    invoke-direct {p0, v6, v0, p1}, La/ker;-><init>(La/eu00;La/h1;B)V

    .line 59
    .line 60
    .line 61
    sget-object p1, La/xun;->a:La/xun;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-virtual {v0, p0, p1, v1}, La/llc;->u0(La/cr30;Ljava/util/Set;La/flc;)V

    .line 65
    .line 66
    .line 67
    return-object v0
.end method


# virtual methods
.method public final D()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xgy;->W()La/wm40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wm40;->g()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final E()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xgy;->X()La/qpy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/qpy;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    sget-object p0, La/iun;->a:La/iun;

    .line 14
    .line 15
    :cond_1
    return-object p0
.end method

.method public final F(La/g950;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/xgy;->W()La/wm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/wm40;->I()La/kzj0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, La/wsy;->y()La/cr30;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, La/ux50;->b:La/ux50;

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, La/cr30;->a(La/g950;La/ux50;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, La/xgy;->W()La/wm40;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, La/wm40;->U()La/cr30;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, La/cr30;->a(La/g950;La/ux50;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final I()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, La/xgy;->X()La/qpy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, La/j24;->f:La/c5k;

    .line 8
    .line 9
    sget-object v1, La/j24;->a:[La/iiy;

    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-virtual {v0, v1, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-ne p0, v0, :cond_0

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final J()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->f:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    return-object p0
.end method

.method public final N(I)La/d0d0;
    .locals 10

    .line 1
    invoke-virtual {p0}, La/xgy;->W()La/wm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, La/ffk;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, La/ffk;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, La/ffk;->e:La/s2d0;

    .line 17
    .line 18
    sget-object v3, La/dgy;->h:La/ijt;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v3, p1}, La/h8x;->M(La/gjt;La/ijt;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v5, p1

    .line 28
    check-cast v5, La/p3d0;

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    new-instance v4, La/ir00;

    .line 33
    .line 34
    invoke-direct {v4, p0}, La/ir00;-><init>(La/ihy;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, La/ffk;->l:La/g45;

    .line 38
    .line 39
    iget-object v1, p1, La/g45;->b:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v6, v1

    .line 42
    check-cast v6, La/h950;

    .line 43
    .line 44
    iget-object p1, p1, La/g45;->d:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, La/roi0;

    .line 48
    .line 49
    iget-object v8, v0, La/ffk;->f:La/e28;

    .line 50
    .line 51
    sget-object v9, La/x0;->r:La/x0;

    .line 52
    .line 53
    iget-object v3, p0, La/xgy;->b:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static/range {v3 .. v9}, La/xtt0;->g(Ljava/lang/Class;La/hfk;La/gjt;La/h950;La/roi0;La/e28;Lkotlin/jvm/functions/Function2;)La/kp9;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, La/d0d0;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    return-object v2
.end method

.method public final O(I)La/dqy;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xgy;->X()La/qpy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, La/j0x;->t(La/qpy;)La/qey;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, La/qey;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/dqy;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final Q(La/g950;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/xgy;->W()La/wm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/wm40;->I()La/kzj0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, La/wsy;->y()La/cr30;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, La/ux50;->b:La/ux50;

    .line 14
    .line 15
    invoke-interface {v0, p1, v1}, La/cr30;->f(La/g950;La/ux50;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, La/xgy;->W()La/wm40;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, La/wm40;->U()La/cr30;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, La/cr30;->f(La/g950;La/ux50;)Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final U()La/qlc;
    .locals 2

    .line 1
    sget-object v0, La/sog0;->a:La/qlc;

    .line 2
    .line 3
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/mfy;->b(Ljava/lang/String;)La/mfy;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, La/mfy;->d()La/iwb0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_0
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance p0, La/qlc;

    .line 40
    .line 41
    sget-object v0, La/j4m0;->l:La/swq;

    .line 42
    .line 43
    iget-object v1, v1, La/iwb0;->b:La/g950;

    .line 44
    .line 45
    invoke-direct {p0, v0, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    sget-object p0, La/i4m0;->g:La/twq;

    .line 50
    .line 51
    invoke-virtual {p0}, La/twq;->i()La/swq;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v0, La/qlc;

    .line 56
    .line 57
    invoke-virtual {p0}, La/swq;->b()La/swq;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 62
    .line 63
    invoke-virtual {p0}, La/twq;->g()La/g950;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v0, v1, p0}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    sget-object p0, La/sog0;->a:La/qlc;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, La/mfy;->b(Ljava/lang/String;)La/mfy;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, La/mfy;->d()La/iwb0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :cond_4
    if-eqz v1, :cond_5

    .line 101
    .line 102
    new-instance p0, La/qlc;

    .line 103
    .line 104
    sget-object v0, La/j4m0;->l:La/swq;

    .line 105
    .line 106
    iget-object v1, v1, La/iwb0;->a:La/g950;

    .line 107
    .line 108
    invoke-direct {p0, v0, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_5
    invoke-static {p0}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-boolean v0, p0, La/qlc;->c:Z

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    sget-object v0, La/bay;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p0}, La/qlc;->a()La/swq;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, La/bay;->g(La/swq;)La/qlc;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_6
    return-object p0
.end method

.method public final V()La/rlc;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/xgy;->X()La/qpy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, La/j24;->a(La/qpy;)La/rlc;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object p0, La/rlc;->f:La/rlc;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    sget-object p0, La/rlc;->c:La/rlc;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    sget-object p0, La/rlc;->d:La/rlc;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_5

    .line 53
    .line 54
    sget-object p0, La/rlc;->e:La/rlc;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_5
    sget-object p0, La/rlc;->b:La/rlc;

    .line 58
    .line 59
    return-object p0
.end method

.method public final W()La/wm40;
    .locals 0

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    invoke-virtual {p0}, La/vgy;->b()La/wm40;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final X()La/qpy;
    .locals 0

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    invoke-virtual {p0}, La/vgy;->c()La/qpy;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final Y()La/fm40;
    .locals 4

    .line 1
    invoke-virtual {p0}, La/xgy;->X()La/qpy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v1, La/j24;->b:La/pmi;

    .line 8
    .line 9
    sget-object v2, La/j24;->a:[La/iiy;

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    aget-object v2, v2, v3

    .line 13
    .line 14
    invoke-virtual {v1, v2, v0}, La/pmi;->v(La/iiy;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/fm40;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0

    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_6

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p0}, La/zdx;->E(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    sget-object p0, La/fm40;->e:La/fm40;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    sget-object p0, La/fm40;->d:La/fm40;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    sget-object p0, La/fm40;->c:La/fm40;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_5
    sget-object p0, La/fm40;->b:La/fm40;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_6
    :goto_1
    sget-object p0, La/fm40;->b:La/fm40;

    .line 84
    .line 85
    return-object p0
.end method

.method public final Z()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->m:La/a8z;

    .line 10
    .line 11
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final b()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->k:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Ljava/util/List;

    .line 25
    .line 26
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/xgy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/azw;->H(La/sgy;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, La/sgy;

    .line 10
    .line 11
    invoke-static {p1}, La/azw;->H(La/sgy;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final findJavaDeclaration()Ljava/lang/reflect/GenericDeclaration;
    .locals 0

    .line 1
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->h:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/util/Collection;

    .line 24
    .line 25
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->e:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->i:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, La/azw;->H(La/sgy;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, La/xgy;->X()La/qpy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    sget-object p0, La/j24;->e:La/c5k;

    .line 30
    .line 31
    sget-object v1, La/j24;->a:[La/iiy;

    .line 32
    .line 33
    const/16 v2, 0xa

    .line 34
    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final j()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/xgy;->Y()La/fm40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/fm40;->e:La/fm40;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final r(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, La/bqe0;->d:Ljava/util/Map;

    .line 2
    .line 3
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0, p1}, La/zys0;->f(ILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-static {p0}, La/bqe0;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object p0, v0

    .line 30
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final s()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->o:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/16 v1, 0xb

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Ljava/util/Collection;

    .line 25
    .line 26
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/xgy;->U()La/qlc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/qlc;->a:La/swq;

    .line 6
    .line 7
    iget-object v1, v0, La/swq;->a:La/twq;

    .line 8
    .line 9
    invoke-virtual {v1}, La/twq;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x2e

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, La/swq;->a:La/twq;

    .line 26
    .line 27
    iget-object v0, v0, La/twq;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iget-object p0, p0, La/qlc;->b:La/swq;

    .line 34
    .line 35
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 36
    .line 37
    iget-object p0, p0, La/twq;->a:Ljava/lang/String;

    .line 38
    .line 39
    const/16 v1, 0x24

    .line 40
    .line 41
    invoke-static {p0, v2, v1}, Lkotlin/text/c;->s(Ljava/lang/String;CC)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "class "

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final v()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgy;

    .line 8
    .line 9
    iget-object p0, p0, La/vgy;->g:La/mre0;

    .line 10
    .line 11
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    return-object p0
.end method
