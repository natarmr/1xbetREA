.class public final synthetic La/wkh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xkh0;


# direct methods
.method public synthetic constructor <init>(La/xkh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wkh0;->a:B

    iput-object p1, p0, La/wkh0;->b:La/xkh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/wkh0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wkh0;->b:La/xkh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/xkh0;->n2:La/gne0;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    instance-of v1, v0, La/af3;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v0, La/af3;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v2

    .line 30
    :goto_0
    const-class v1, La/ykh0;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/o5d0;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/ze3;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v0, v2

    .line 54
    :goto_1
    instance-of v3, v0, La/ykh0;

    .line 55
    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    move-object v0, v2

    .line 59
    :cond_2
    check-cast v0, La/ykh0;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v1, p0, La/xkh0;->m2:La/khf0;

    .line 64
    .line 65
    sget-object v2, La/xkh0;->o2:[La/iiy;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    aget-object v2, v2, v3

    .line 69
    .line 70
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 75
    .line 76
    iget-object v1, v0, La/ykh0;->a:La/ctf0;

    .line 77
    .line 78
    iget-object v2, v0, La/ykh0;->b:La/mne;

    .line 79
    .line 80
    iget-object v3, v0, La/ykh0;->c:La/wdk0;

    .line 81
    .line 82
    iget-object v0, v0, La/ykh0;->d:La/lef0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v3, La/tsi;

    .line 91
    .line 92
    invoke-direct {v3, v0, p0, v1, v2}, La/tsi;-><init>(La/lef0;Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;La/ctf0;La/mne;)V

    .line 93
    .line 94
    .line 95
    move-object v2, v3

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 98
    .line 99
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    return-object v2

    .line 107
    :pswitch_0
    iget-object p0, p0, La/xkh0;->l2:La/a8z;

    .line 108
    .line 109
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, La/tsi;

    .line 114
    .line 115
    new-instance v0, La/fiu0;

    .line 116
    .line 117
    const-class v1, La/hlh0;

    .line 118
    .line 119
    iget-object p0, p0, La/tsi;->e:La/fri;

    .line 120
    .line 121
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_1
    sget-object v0, La/xkh0;->n2:La/gne0;

    .line 130
    .line 131
    invoke-virtual {p0}, La/xkh0;->P0()La/k3t0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    sget-object v0, La/tkh0;->a:La/tkh0;

    .line 136
    .line 137
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_2
    sget-object v0, La/xkh0;->n2:La/gne0;

    .line 144
    .line 145
    invoke-virtual {p0}, La/xkh0;->P0()La/k3t0;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    sget-object v0, La/skh0;->a:La/skh0;

    .line 150
    .line 151
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
