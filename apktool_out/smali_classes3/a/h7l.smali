.class public final synthetic La/h7l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u4l;


# direct methods
.method public synthetic constructor <init>(La/u4l;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h7l;->a:B

    iput-object p1, p0, La/h7l;->b:La/u4l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/h7l;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/h7l;->b:La/u4l;

    .line 6
    .line 7
    check-cast p1, La/j7l;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/u4l;->c:La/xnp0;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/j7l;->setTeam(La/xnp0;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, La/u4l;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, La/j7l;->setHeroes(Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, La/u4l;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, La/j7l;->setHeroesItems(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/u4l;->f:La/lc00;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, La/j7l;->setAdditionalInformation(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/u4l;->g:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, La/j7l;->setItems(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    iget-byte p0, p0, La/u4l;->b:B

    .line 41
    .line 42
    int-to-long v3, p0

    .line 43
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, La/j7l;->a:La/vd7;

    .line 51
    .line 52
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 53
    .line 54
    check-cast p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsViewContainer;

    .line 55
    .line 56
    iget-object v0, p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsViewContainer;->a:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    add-int/lit8 v4, v2, 0x1

    .line 79
    .line 80
    if-ltz v2, :cond_1

    .line 81
    .line 82
    check-cast v3, La/o6l;

    .line 83
    .line 84
    iget-object v5, p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsViewContainer;->c:La/amw;

    .line 85
    .line 86
    if-eqz v5, :cond_0

    .line 87
    .line 88
    new-instance v6, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v6, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v5, v2, v3}, La/amw;->a(Ljava/lang/String;Landroid/widget/HorizontalScrollView;)V

    .line 101
    .line 102
    .line 103
    :cond_0
    move v2, v4

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 106
    .line 107
    .line 108
    throw v1

    .line 109
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-byte p0, p0, La/u4l;->b:B

    .line 116
    .line 117
    int-to-long v3, p0

    .line 118
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object p1, p1, La/j7l;->a:La/vd7;

    .line 126
    .line 127
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 128
    .line 129
    check-cast p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsViewContainer;

    .line 130
    .line 131
    iget-object v0, p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsViewContainer;->a:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Ljava/lang/Iterable;

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    add-int/lit8 v4, v2, 0x1

    .line 154
    .line 155
    if-ltz v2, :cond_4

    .line 156
    .line 157
    check-cast v3, La/o6l;

    .line 158
    .line 159
    iget-object v5, p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsViewContainer;->c:La/amw;

    .line 160
    .line 161
    if-eqz v5, :cond_3

    .line 162
    .line 163
    new-instance v6, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v6, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v5, v2, v3}, La/amw;->b(Ljava/lang/String;Landroid/widget/HorizontalScrollView;)V

    .line 176
    .line 177
    .line 178
    :cond_3
    move v2, v4

    .line 179
    goto :goto_1

    .line 180
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 181
    .line 182
    .line 183
    throw v1

    .line 184
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
