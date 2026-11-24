.class public final La/kz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/kz2;->a:B

    iput-object p1, p0, La/kz2;->b:Ljava/lang/Object;

    iput-object p2, p0, La/kz2;->c:Ljava/lang/Object;

    iput-object p3, p0, La/kz2;->d:Ljava/lang/Object;

    iput-object p4, p0, La/kz2;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/kz2;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/kz2;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/kz2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/kz2;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, La/kz2;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {p0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    check-cast v2, Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    check-cast v1, La/pz40;

    .line 31
    .line 32
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/util/List;

    .line 37
    .line 38
    instance-of v0, p0, Ljava/util/RandomAccess;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/lit8 v0, v0, -0x1

    .line 47
    .line 48
    if-ltz v0, :cond_2

    .line 49
    .line 50
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 51
    .line 52
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/pb50;

    .line 57
    .line 58
    iget-object v0, v0, La/pb50;->a:Lkotlin/jvm/functions/Function1;

    .line 59
    .line 60
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    if-gez v1, :cond_0

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_0
    move v0, v1

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/pb50;

    .line 87
    .line 88
    iget-object v0, v0, La/pb50;->a:Lkotlin/jvm/functions/Function1;

    .line 89
    .line 90
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    :goto_2
    return-void

    .line 95
    :pswitch_0
    check-cast p0, Landroidx/fragment/app/e;

    .line 96
    .line 97
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 98
    .line 99
    invoke-virtual {p0, v3}, Landroidx/fragment/app/e;->q0(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment$SavedState;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v2, La/d5r;

    .line 104
    .line 105
    iget-object v2, v2, La/d5r;->a:La/pz40;

    .line 106
    .line 107
    invoke-interface {v2, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    check-cast v1, La/hie0;

    .line 111
    .line 112
    iget-boolean v0, v1, La/hie0;->a:Z

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    new-instance v0, La/zb5;

    .line 117
    .line 118
    invoke-direct {v0, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v3}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, La/zb5;->i()V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/e;->a0()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    new-instance v0, La/zb5;

    .line 135
    .line 136
    invoke-direct {v0, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, La/zb5;->h()V

    .line 143
    .line 144
    .line 145
    :cond_4
    :goto_3
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
