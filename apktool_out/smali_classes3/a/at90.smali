.class public final synthetic La/at90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/et90;


# direct methods
.method public synthetic constructor <init>(La/et90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/at90;->a:B

    iput-object p1, p0, La/at90;->b:La/et90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget-byte p1, p0, La/at90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/at90;->b:La/et90;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/et90;->j2:La/mi70;

    .line 9
    .line 10
    new-instance p1, La/bt90;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p1, p0, v0}, La/bt90;-><init>(La/et90;B)V

    .line 14
    .line 15
    .line 16
    const-string v0, "REQUEST_EXIT_WARNING_DIALOG_KEY"

    .line 17
    .line 18
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/et90;->e2:La/n0o0;

    .line 22
    .line 23
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, La/vni;

    .line 28
    .line 29
    iget-object p1, p1, La/vni;->c:La/ii;

    .line 30
    .line 31
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 32
    .line 33
    const v1, 0x7f1303fb

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const v2, 0x7f13047e

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const v3, 0x7f130a86

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const v4, 0x7f13032f

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v9, La/n12;->a:La/n12;

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    const/16 v11, 0x5d0

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const-string v6, "REQUEST_EXIT_WARNING_DIALOG_KEY"

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_0
    sget-object p1, La/et90;->j2:La/mi70;

    .line 89
    .line 90
    invoke-virtual {p0}, La/et90;->U0()La/kt90;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iget-object p1, p0, La/kt90;->e:La/p7m0;

    .line 95
    .line 96
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/lt90;

    .line 101
    .line 102
    iget-object v0, v0, La/lt90;->b:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_1

    .line 109
    .line 110
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, La/lt90;

    .line 116
    .line 117
    iget-object v2, p0, La/kt90;->c:La/ctf0;

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    new-array v4, v3, [Ljava/lang/Object;

    .line 121
    .line 122
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 123
    .line 124
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const v4, 0x7f131160

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget-object v1, v1, La/lt90;->b:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v3, La/lt90;

    .line 141
    .line 142
    invoke-direct {v3, v2, v1}, La/lt90;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_0

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    new-instance v0, La/c670;

    .line 157
    .line 158
    const/16 v1, 0xc

    .line 159
    .line 160
    const/4 v2, 0x0

    .line 161
    invoke-direct {v0, p0, v2, v1}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 162
    .line 163
    .line 164
    const/4 p0, 0x3

    .line 165
    invoke-static {p1, v2, v2, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 166
    .line 167
    .line 168
    :goto_0
    return-void

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
