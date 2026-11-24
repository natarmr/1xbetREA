.class public final La/wr3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wr3;->i:B

    iput-object p1, p0, La/wr3;->k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wr3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wr3;->k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wr3;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wr3;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wr3;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wr3;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wr3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Locale;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wr3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wr3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wr3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/db50;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wr3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wr3;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wr3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/wr3;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/wr3;->k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 4
    .line 5
    iget-object p0, p0, La/wr3;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/Locale;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p0}, La/u7x;->u(Landroid/content/Context;Ljava/util/Locale;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p0, La/db50;

    .line 24
    .line 25
    sget-object v0, La/wne;->a:La/wne;

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, La/db50;->b:Ljava/lang/Float;

    .line 31
    .line 32
    iget-boolean p0, p0, La/db50;->a:Z

    .line 33
    .line 34
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 35
    .line 36
    iget-object v0, v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 37
    .line 38
    iget-object v2, v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 39
    .line 40
    iget-object v3, v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 41
    .line 42
    iget-object v4, v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    new-array v5, v5, [La/ndk0;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    aput-object v0, v5, v6

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    aput-object v2, v5, v0

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    aput-object v3, v5, v0

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    aput-object v4, v5, v0

    .line 58
    .line 59
    invoke-static {v5}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, La/ndk0;

    .line 80
    .line 81
    invoke-virtual {v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, La/wdk0;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-interface {v2}, La/ndk0;->c()La/rrm;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iget-object v5, v4, La/g46;->i:La/f46;

    .line 102
    .line 103
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    instance-of v7, v2, La/ldk0;

    .line 108
    .line 109
    if-eqz v7, :cond_1

    .line 110
    .line 111
    invoke-virtual {v3, v4}, La/wdk0;->p(La/rrm;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    instance-of v2, v2, La/mdk0;

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    if-nez p0, :cond_2

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v4, v5, v6, v7}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    if-eqz p1, :cond_3

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v3, v4, v2}, La/wdk0;->m(La/rrm;F)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v4, v5, v6}, La/wdk0;->n(La/rrm;Landroid/content/res/Resources;I)V

    .line 143
    .line 144
    .line 145
    :goto_1
    invoke-virtual {v4}, La/g46;->b()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_0

    .line 150
    .line 151
    invoke-virtual {v4}, La/g46;->e()V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    :goto_2
    return-object v7

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
