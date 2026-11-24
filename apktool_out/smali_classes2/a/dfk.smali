.class public final La/dfk;
.super La/pfk;
.source "SourceFile"


# static fields
.field public static final synthetic h:I


# instance fields
.field public final g:La/cu00;


# direct methods
.method public constructor <init>(La/ffk;)V
    .locals 6

    .line 1
    iget-object v1, p1, La/ffk;->l:La/g45;

    .line 2
    .line 3
    iget-object p1, p1, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget-object v0, p1, La/s2d0;->q:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    move-object v4, v3

    .line 26
    check-cast v4, La/i3d0;

    .line 27
    .line 28
    sget-object v5, La/njq;->A:La/kjq;

    .line 29
    .line 30
    iget v4, v4, La/i3d0;->d:I

    .line 31
    .line 32
    invoke-virtual {v5, v4}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p1, La/s2d0;->r:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {p1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v4, v0

    .line 67
    check-cast v4, La/p3d0;

    .line 68
    .line 69
    sget-object v5, La/njq;->L:La/kjq;

    .line 70
    .line 71
    iget v4, v4, La/p3d0;->d:I

    .line 72
    .line 73
    invoke-virtual {v5, v4}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    sget-object v4, La/iun;->a:La/iun;

    .line 88
    .line 89
    sget-object v5, La/t55;->i:La/t55;

    .line 90
    .line 91
    move-object v0, p0

    .line 92
    invoke-direct/range {v0 .. v5}, La/pfk;-><init>(La/g45;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, v1, La/g45;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, La/f6i;

    .line 98
    .line 99
    iget-object p0, p0, La/f6i;->e:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, La/eu00;

    .line 102
    .line 103
    new-instance p1, La/v9k;

    .line 104
    .line 105
    const/16 v1, 0xa

    .line 106
    .line 107
    invoke-direct {p1, v0, v1}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v1, La/cu00;

    .line 114
    .line 115
    invoke-direct {v1, p0, p1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, v0, La/dfk;->g:La/cu00;

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/dfk;->g:La/cu00;

    .line 5
    .line 6
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method
