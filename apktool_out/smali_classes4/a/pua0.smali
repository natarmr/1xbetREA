.class public final La/pua0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rua0;


# direct methods
.method public synthetic constructor <init>(La/rua0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pua0;->a:B

    iput-object p1, p0, La/pua0;->b:La/rua0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pua0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/pua0;->b:La/rua0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, La/gua0;

    .line 25
    .line 26
    iget-object v2, v2, La/gua0;->a:La/fua0;

    .line 27
    .line 28
    instance-of v2, v2, La/eua0;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 33
    .line 34
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 44
    .line 45
    move-object v4, v1

    .line 46
    check-cast v4, La/gua0;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v5, La/cua0;

    .line 52
    .line 53
    new-instance v3, Ljava/net/UnknownHostException;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/net/UnknownHostException;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v3}, La/cua0;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    const/4 v15, 0x0

    .line 62
    const v16, 0x1fffe

    .line 63
    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    const/4 v14, 0x0

    .line 74
    invoke-static/range {v4 .. v16}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/gua0;

    .line 92
    .line 93
    iget-object v1, v1, La/gua0;->a:La/fua0;

    .line 94
    .line 95
    instance-of v1, v1, La/dua0;

    .line 96
    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-virtual {v0, v1}, La/rua0;->N(Z)V

    .line 101
    .line 102
    .line 103
    :cond_2
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_0
    move-object/from16 v1, p1

    .line 107
    .line 108
    check-cast v1, La/knb;

    .line 109
    .line 110
    sget-object v2, La/rua0;->G:Ljava/util/List;

    .line 111
    .line 112
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 113
    .line 114
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 115
    .line 116
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 124
    .line 125
    move-object v5, v3

    .line 126
    check-cast v5, La/gua0;

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v6, La/dua0;

    .line 132
    .line 133
    invoke-direct {v6, v1}, La/dua0;-><init>(La/knb;)V

    .line 134
    .line 135
    .line 136
    const/16 v16, 0x0

    .line 137
    .line 138
    const v17, 0x1ffbe

    .line 139
    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    const/4 v8, 0x0

    .line 143
    const/4 v9, 0x0

    .line 144
    const/4 v10, 0x0

    .line 145
    const/4 v11, 0x0

    .line 146
    const/4 v12, 0x0

    .line 147
    const/4 v13, 0x0

    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    invoke-static/range {v5 .. v17}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_3

    .line 159
    .line 160
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
