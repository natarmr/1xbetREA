.class public final La/dw10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dw10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uuz",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final V1:La/uuz;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/hnm0;

.field public final M1:La/s0r;

.field public final N1:La/a8z;

.field public final O1:La/kiu0;

.field public final P1:La/yzn0;

.field public Q1:La/y2c0;

.field public R1:La/n2c0;

.field public final S1:La/yzn0;

.field public final U1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dw10;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentMainMenuContainerBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "menuSectionStart"

    .line 16
    .line 17
    const-string v5, "getMenuSectionStart()Lorg/xplatform/main_menu/api/domain/models/MenuSectionType;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "showChangeAccount"

    .line 25
    .line 26
    const-string v6, "getShowChangeAccount()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "openTgBot"

    .line 34
    .line 35
    const-string v7, "getOpenTgBot()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/dw10;->W1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/uuz;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/dw10;->V1:La/uuz;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0262

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/dw10;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/hnm0;->a:La/hnm0;

    .line 11
    .line 12
    iput-object v1, p0, La/dw10;->L1:La/hnm0;

    .line 13
    .line 14
    sget-object v1, La/bw10;->a:La/bw10;

    .line 15
    .line 16
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, La/dw10;->M1:La/s0r;

    .line 21
    .line 22
    new-instance v1, La/zv10;

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-direct {v1, p0, v2}, La/zv10;-><init>(La/dw10;B)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/wez;->b:La/wez;

    .line 29
    .line 30
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, La/dw10;->N1:La/a8z;

    .line 35
    .line 36
    new-instance v1, La/zv10;

    .line 37
    .line 38
    const/4 v3, 0x5

    .line 39
    invoke-direct {v1, p0, v3}, La/zv10;-><init>(La/dw10;B)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/pv10;

    .line 43
    .line 44
    invoke-direct {v3, v1, v0}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/pv10;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    invoke-direct {v0, p0, v1}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/pv10;

    .line 54
    .line 55
    const/4 v4, 0x3

    .line 56
    invoke-direct {v1, v0, v4}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-class v1, La/cx10;

    .line 64
    .line 65
    sget-object v2, La/sre0;->a:La/tre0;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v2, La/j210;

    .line 72
    .line 73
    const/16 v4, 0x16

    .line 74
    .line 75
    invoke-direct {v2, v0, v4}, La/j210;-><init>(La/a8z;B)V

    .line 76
    .line 77
    .line 78
    new-instance v4, La/j210;

    .line 79
    .line 80
    const/16 v5, 0x17

    .line 81
    .line 82
    invoke-direct {v4, v0, v5}, La/j210;-><init>(La/a8z;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v1, v2, v4, v3}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, La/dw10;->O1:La/kiu0;

    .line 90
    .line 91
    new-instance v0, La/yzn0;

    .line 92
    .line 93
    const-string v1, "MENU_SECTION_TAB_KEY"

    .line 94
    .line 95
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, La/dw10;->P1:La/yzn0;

    .line 99
    .line 100
    new-instance v0, La/yzn0;

    .line 101
    .line 102
    const-string v1, "MENU_SHOW_CHANGE_ACCOUNT"

    .line 103
    .line 104
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, La/dw10;->S1:La/yzn0;

    .line 108
    .line 109
    new-instance v0, La/cgx0;

    .line 110
    .line 111
    const-string v1, "open_bot"

    .line 112
    .line 113
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, La/dw10;->U1:La/cgx0;

    .line 117
    .line 118
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/j1r;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 6
    .line 7
    new-instance v0, La/zv10;

    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-direct {v0, p0, v1}, La/zv10;-><init>(La/dw10;B)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p1, v0, v1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/j1r;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 22
    .line 23
    sget-object v0, La/ymx;->h:La/ymx;

    .line 24
    .line 25
    new-instance v2, La/zv10;

    .line 26
    .line 27
    const/4 v3, 0x7

    .line 28
    invoke-direct {v2, p0, v3}, La/zv10;-><init>(La/dw10;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->y(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, La/j1r;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 39
    .line 40
    new-instance v2, La/zv10;

    .line 41
    .line 42
    const/16 v3, 0x8

    .line 43
    .line 44
    invoke-direct {v2, p0, v3}, La/zv10;-><init>(La/dw10;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->A(La/ymx;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p1, p1, La/j1r;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 55
    .line 56
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getAuthorizationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, La/aw10;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {v0, p0, v2}, La/aw10;-><init>(La/dw10;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object p1, p1, La/j1r;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 74
    .line 75
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getRegistrationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, La/aw10;

    .line 80
    .line 81
    invoke-direct {v0, p0, v1}, La/aw10;-><init>(La/dw10;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, La/j1r;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 92
    .line 93
    iget-object p1, p1, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 94
    .line 95
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object p1, p1, La/j1r;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 103
    .line 104
    new-instance v3, La/hc50;

    .line 105
    .line 106
    sget-object v6, La/ybg0;->b:La/ybg0;

    .line 107
    .line 108
    new-instance v7, La/zv10;

    .line 109
    .line 110
    const/16 v0, 0x9

    .line 111
    .line 112
    invoke-direct {v7, p0, v0}, La/zv10;-><init>(La/dw10;B)V

    .line 113
    .line 114
    .line 115
    const/16 v8, 0x7f0

    .line 116
    .line 117
    const-string v4, "settings"

    .line 118
    .line 119
    move-object v5, v6

    .line 120
    const v6, 0x7f0809fc

    .line 121
    .line 122
    .line 123
    invoke-direct/range {v3 .. v8}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 124
    .line 125
    .line 126
    filled-new-array {v3}, [La/hc50;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p1, p1, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 142
    .line 143
    new-instance v0, La/km00;

    .line 144
    .line 145
    const/16 v3, 0xe

    .line 146
    .line 147
    invoke-direct {v0, p0, v3}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p1, p1, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 158
    .line 159
    sget-object v0, La/r0m;->l:La/r0m;

    .line 160
    .line 161
    new-instance v4, La/hc50;

    .line 162
    .line 163
    new-instance v8, La/zv10;

    .line 164
    .line 165
    invoke-direct {v8, p0, v2}, La/zv10;-><init>(La/dw10;B)V

    .line 166
    .line 167
    .line 168
    const/16 v9, 0x6f0

    .line 169
    .line 170
    move-object v6, v5

    .line 171
    const-string v5, "message"

    .line 172
    .line 173
    const v7, 0x7f08098c

    .line 174
    .line 175
    .line 176
    invoke-direct/range {v4 .. v9}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 177
    .line 178
    .line 179
    move-object v0, v4

    .line 180
    move-object v5, v6

    .line 181
    new-instance v4, La/hc50;

    .line 182
    .line 183
    new-instance v8, La/zv10;

    .line 184
    .line 185
    invoke-direct {v8, p0, v1}, La/zv10;-><init>(La/dw10;B)V

    .line 186
    .line 187
    .line 188
    const/16 v9, 0x7f0

    .line 189
    .line 190
    const-string v5, "settings"

    .line 191
    .line 192
    const v7, 0x7f0809fc

    .line 193
    .line 194
    .line 195
    invoke-direct/range {v4 .. v9}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 196
    .line 197
    .line 198
    filled-new-array {v0, v4}, [La/hc50;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final D0()V
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, La/dw10;->I0()La/cx10;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/cx10;->y:La/dmt;

    .line 6
    .line 7
    invoke-virtual {v0}, La/dmt;->b()La/kg;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x3

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eq v0, v2, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-eq v0, v2, :cond_2

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    const v0, 0x7f140720

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const v0, 0x7f140722

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const v0, 0x7f140724

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const v0, 0x7f140723

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    const v0, 0x7f140721

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v2, La/eu4;

    .line 57
    .line 58
    const/16 v3, 0xc

    .line 59
    .line 60
    invoke-direct {v2, v0, v3}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/bh0;

    .line 64
    .line 65
    const/16 v4, 0xd

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    move-object/from16 v12, p0

    .line 69
    .line 70
    invoke-direct {v0, v12, v9, v4}, La/bh0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    sget-object v4, La/lkz;->a:La/lkz;

    .line 74
    .line 75
    invoke-static {v12}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    new-instance v6, La/cm10;

    .line 88
    .line 89
    invoke-direct {v6, v2, v4, v0, v9}, La/cm10;-><init>(La/eu4;La/clz;La/bh0;La/yje;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v5, v9, v9, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v12}, La/dw10;->I0()La/cx10;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v2, v0, La/cx10;->I:La/p7m0;

    .line 100
    .line 101
    new-instance v4, La/uw10;

    .line 102
    .line 103
    const/4 v5, 0x0

    .line 104
    invoke-direct {v4, v0, v9, v5}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 105
    .line 106
    .line 107
    new-instance v6, La/s6n0;

    .line 108
    .line 109
    invoke-direct {v6, v2, v4}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/gbv;

    .line 113
    .line 114
    const/4 v4, 0x6

    .line 115
    invoke-direct {v2, v0, v9, v4}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 116
    .line 117
    .line 118
    new-instance v0, La/dnq;

    .line 119
    .line 120
    invoke-direct {v0, v6, v2, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 121
    .line 122
    .line 123
    new-instance v10, La/dm10;

    .line 124
    .line 125
    const/16 v16, 0x4

    .line 126
    .line 127
    const/16 v17, 0xe

    .line 128
    .line 129
    const/4 v11, 0x2

    .line 130
    const-class v13, La/dw10;

    .line 131
    .line 132
    const-string v14, "handleUiState"

    .line 133
    .line 134
    const-string v15, "handleUiState(Lorg/xplatform/main_menu/impl/presentation/container/MainMenuContainerViewModel$UiState;)V"

    .line 135
    .line 136
    invoke-direct/range {v10 .. v17}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 137
    .line 138
    .line 139
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    new-instance v5, La/cm10;

    .line 152
    .line 153
    invoke-direct {v5, v0, v2, v10, v9}, La/cm10;-><init>(La/dnq;La/clz;La/dm10;La/yje;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4, v9, v9, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {p0 .. p0}, La/dw10;->I0()La/cx10;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v6, v0, La/cx10;->G:La/ol60;

    .line 164
    .line 165
    new-instance v8, La/dm10;

    .line 166
    .line 167
    const/16 v17, 0xf

    .line 168
    .line 169
    const-string v14, "handleUiAction"

    .line 170
    .line 171
    const-string v15, "handleUiAction(Lorg/xplatform/main_menu/impl/presentation/container/MainMenuContainerViewModel$UiAction;)V"

    .line 172
    .line 173
    move-object v10, v8

    .line 174
    invoke-direct/range {v10 .. v17}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 175
    .line 176
    .line 177
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-instance v5, La/cm10;

    .line 190
    .line 191
    const/4 v10, 0x0

    .line 192
    invoke-direct/range {v5 .. v10}, La/cm10;-><init>(La/gmq;La/clz;La/dm10;La/yje;C)V

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v9, v9, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {p0 .. p0}, La/dw10;->I0()La/cx10;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iget-object v6, v0, La/cx10;->H:La/p7m0;

    .line 203
    .line 204
    new-instance v8, La/dm10;

    .line 205
    .line 206
    const/16 v17, 0x10

    .line 207
    .line 208
    const-string v14, "handleSessionTimerState"

    .line 209
    .line 210
    const-string v15, "handleSessionTimerState(Ljava/lang/String;)V"

    .line 211
    .line 212
    move-object v10, v8

    .line 213
    invoke-direct/range {v10 .. v17}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 214
    .line 215
    .line 216
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    new-instance v5, La/cm10;

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    invoke-direct/range {v5 .. v10}, La/cm10;-><init>(La/gmq;La/clz;La/dm10;La/yje;I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v0, v9, v9, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {p0 .. p0}, La/dw10;->I0()La/cx10;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iget-object v0, v0, La/cx10;->F:La/sff0;

    .line 242
    .line 243
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 244
    .line 245
    iget-object v0, v0, La/mum0;->f:La/ay10;

    .line 246
    .line 247
    new-instance v2, La/eu4;

    .line 248
    .line 249
    invoke-direct {v2, v0, v3}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 250
    .line 251
    .line 252
    sget-object v0, La/lkz;->a:La/lkz;

    .line 253
    .line 254
    new-instance v10, La/dm10;

    .line 255
    .line 256
    const/16 v17, 0x11

    .line 257
    .line 258
    const-string v14, "handleMenuStyleTypeState"

    .line 259
    .line 260
    const-string v15, "handleMenuStyleTypeState(Lorg/xplatform/remoteconfig/domain/models/MainMenuStyleConfigType;)V"

    .line 261
    .line 262
    invoke-direct/range {v10 .. v17}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 263
    .line 264
    .line 265
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    new-instance v4, La/cm10;

    .line 278
    .line 279
    invoke-direct {v4, v2, v0, v10, v9}, La/cm10;-><init>(La/eu4;La/clz;La/dm10;La/yje;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v3, v9, v9, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 283
    .line 284
    .line 285
    return-void
.end method

.method public final G0()La/j1r;
    .locals 2

    .line 1
    sget-object v0, La/dw10;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dw10;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/j1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/vki;
    .locals 0

    .line 1
    iget-object p0, p0, La/dw10;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vki;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0()La/cx10;
    .locals 0

    .line 1
    iget-object p0, p0, La/dw10;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cx10;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/yv10;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, La/yv10;-><init>(La/dw10;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "SELECT_BALANCE_REQUEST_KEY"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, La/yv10;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, v1}, La/yv10;-><init>(La/dw10;B)V

    .line 27
    .line 28
    .line 29
    const-string v1, "CHANGE_BALANCE_REQUEST_KEY"

    .line 30
    .line 31
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, La/o0t;

    .line 35
    .line 36
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/4 v8, 0x0

    .line 41
    const/16 v9, 0x12

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const-class v5, La/cx10;

    .line 45
    .line 46
    const-string v6, "onPassIdentificationClicked"

    .line 47
    .line 48
    const-string v7, "onPassIdentificationClicked()V"

    .line 49
    .line 50
    invoke-direct/range {v2 .. v9}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 51
    .line 52
    .line 53
    const-string p1, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY"

    .line 54
    .line 55
    invoke-static {p0, p1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 8
    .line 9
    invoke-virtual {v0}, La/wf40;->c()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/dw10;->G0()La/j1r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 17
    .line 18
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 19
    .line 20
    invoke-virtual {v0}, La/oiz;->a()V

    .line 21
    .line 22
    .line 23
    invoke-super {p0}, La/yx5;->Z()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final e0()V
    .locals 25

    .line 1
    invoke-super/range {p0 .. p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, La/dw10;->I0()La/cx10;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object v8, v2, La/cx10;->f:La/mne;

    .line 9
    .line 10
    iget-boolean v0, v2, La/cx10;->J:Z

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v2, La/cx10;->I:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v10, v1

    .line 22
    check-cast v10, La/rw10;

    .line 23
    .line 24
    const/16 v23, 0x0

    .line 25
    .line 26
    const/16 v24, 0x7eff

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v15, 0x0

    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    const/16 v17, 0x0

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    const/16 v19, 0x0

    .line 40
    .line 41
    const/16 v20, 0x0

    .line 42
    .line 43
    const/16 v21, 0x0

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    invoke-static/range {v10 .. v24}, La/rw10;->a(La/rw10;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/Integer;La/i8m0;La/qw10;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)La/rw10;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, v2, La/cx10;->A:La/wpt;

    .line 59
    .line 60
    iget-object v0, v0, La/wpt;->a:La/z220;

    .line 61
    .line 62
    iget-object v0, v0, La/z220;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, La/esh0;

    .line 65
    .line 66
    iget-object v0, v0, La/esh0;->c:La/p7m0;

    .line 67
    .line 68
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, La/ewt;

    .line 73
    .line 74
    const/16 v3, 0x16

    .line 75
    .line 76
    invoke-direct {v1, v0, v2, v3}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/fw10;

    .line 80
    .line 81
    const/4 v3, 0x4

    .line 82
    invoke-direct {v0, v2, v9, v3}, La/fw10;-><init>(La/cx10;La/yje;B)V

    .line 83
    .line 84
    .line 85
    new-instance v10, La/fnq;

    .line 86
    .line 87
    invoke-direct {v10, v1, v0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, v8, La/mne;->a:La/rwj;

    .line 95
    .line 96
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    new-instance v0, La/dm10;

    .line 101
    .line 102
    const/4 v6, 0x4

    .line 103
    const/16 v7, 0x16

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    const-class v3, La/cx10;

    .line 107
    .line 108
    const-string v4, "handleError"

    .line 109
    .line 110
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 111
    .line 112
    invoke-direct/range {v0 .. v7}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-static {v10, v11, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 116
    .line 117
    .line 118
    :goto_0
    iget-object v0, v2, La/cx10;->E:La/v8d;

    .line 119
    .line 120
    iget-object v0, v0, La/v8d;->p:La/lxw;

    .line 121
    .line 122
    sget-object v1, La/lxw;->h:La/lxw;

    .line 123
    .line 124
    if-ne v0, v1, :cond_2

    .line 125
    .line 126
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    iget-object v13, v8, La/mne;->b:La/dvj;

    .line 131
    .line 132
    new-instance v11, La/km00;

    .line 133
    .line 134
    const/16 v0, 0xf

    .line 135
    .line 136
    invoke-direct {v11, v2, v0}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    new-instance v14, La/xw10;

    .line 140
    .line 141
    const/4 v0, 0x5

    .line 142
    invoke-direct {v14, v2, v9, v0}, La/xw10;-><init>(La/cx10;La/yje;B)V

    .line 143
    .line 144
    .line 145
    const/16 v15, 0xa

    .line 146
    .line 147
    const/4 v12, 0x0

    .line 148
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 149
    .line 150
    .line 151
    :cond_2
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/dw10;->K1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dw10;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
