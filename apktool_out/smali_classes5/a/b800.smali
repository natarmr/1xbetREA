.class public final La/b800;
.super La/lhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/cp;

.field public final synthetic b:La/gkz;

.field public final synthetic c:La/gkz;


# direct methods
.method public constructor <init>(La/cp;La/gkz;La/gkz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b800;->a:La/cp;

    .line 5
    .line 6
    iput-object p2, p0, La/b800;->b:La/gkz;

    .line 7
    .line 8
    iput-object p3, p0, La/b800;->c:La/gkz;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3

    .line 1
    iget-object p1, p0, La/b800;->a:La/cp;

    .line 2
    .line 3
    iget-object p1, p1, La/cp;->u:La/yfu0;

    .line 4
    .line 5
    move-object p2, p1

    .line 6
    check-cast p2, La/ssx;

    .line 7
    .line 8
    iget-object p2, p2, La/ssx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_9

    .line 16
    .line 17
    iget-object v0, p0, La/b800;->c:La/gkz;

    .line 18
    .line 19
    iget-object v0, v0, La/zz3;->e:La/yz3;

    .line 20
    .line 21
    move-object v1, p1

    .line 22
    check-cast v1, La/ssx;

    .line 23
    .line 24
    iget-object v1, v1, La/ssx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v1, -0x1

    .line 31
    if-ne p2, v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    iget-object p0, p0, La/b800;->b:La/gkz;

    .line 36
    .line 37
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 38
    .line 39
    iget-object v2, p0, La/yz3;->f:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    instance-of v2, v2, La/v700;

    .line 46
    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    check-cast p1, La/ssx;

    .line 50
    .line 51
    iget-object p0, p1, La/ssx;->c:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 52
    .line 53
    iget-object p1, v0, La/yz3;->f:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, La/z700;

    .line 73
    .line 74
    instance-of p2, p2, La/r700;

    .line 75
    .line 76
    if-eqz p2, :cond_1

    .line 77
    .line 78
    move v1, p3

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    add-int/lit8 p3, p3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    iget-object v2, p0, La/yz3;->f:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    instance-of v2, v2, La/w700;

    .line 94
    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    check-cast p1, La/ssx;

    .line 98
    .line 99
    iget-object p0, p1, La/ssx;->c:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 100
    .line 101
    iget-object p1, v0, La/yz3;->f:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_5

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    check-cast p2, La/z700;

    .line 121
    .line 122
    instance-of p2, p2, La/s700;

    .line 123
    .line 124
    if-eqz p2, :cond_4

    .line 125
    .line 126
    move v1, p3

    .line 127
    goto :goto_3

    .line 128
    :cond_4
    add-int/lit8 p3, p3, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    :goto_3
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    instance-of p0, p0, La/x700;

    .line 142
    .line 143
    if-eqz p0, :cond_9

    .line 144
    .line 145
    check-cast p1, La/ssx;

    .line 146
    .line 147
    iget-object p0, p1, La/ssx;->c:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 148
    .line 149
    iget-object p1, v0, La/yz3;->f:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_8

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    check-cast p2, La/z700;

    .line 169
    .line 170
    instance-of p2, p2, La/t700;

    .line 171
    .line 172
    if-eqz p2, :cond_7

    .line 173
    .line 174
    move v1, p3

    .line 175
    goto :goto_5

    .line 176
    :cond_7
    add-int/lit8 p3, p3, 0x1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    :goto_5
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 180
    .line 181
    .line 182
    :cond_9
    :goto_6
    return-void
.end method
