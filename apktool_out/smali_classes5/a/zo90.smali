.class public final La/zo90;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/djk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/zo90;",
        "La/stl;",
        "La/djk;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final p2:La/fl70;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public g2:La/pni;

.field public h2:La/qni;

.field public final i2:La/nae0;

.field public final j2:La/kiu0;

.field public final k2:La/n0o0;

.field public final l2:La/a8z;

.field public final m2:La/khf0;

.field public final n2:La/phf0;

.field public final o2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/zo90;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/picker/impl/databinding/DialogPickerBinding;"

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
    const-string v3, "pickerParams"

    .line 16
    .line 17
    const-string v5, "getPickerParams()Lorg/xplatform/picker/api/presentation/PickerParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "customRequestKey"

    .line 25
    .line 26
    const-string v6, "getCustomRequestKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "analyticsEntryPoint"

    .line 34
    .line 35
    const-string v7, "getAnalyticsEntryPoint()Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;"

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
    sput-object v1, La/zo90;->q2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/fl70;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/zo90;->p2:La/fl70;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/yo90;->a:La/yo90;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/zo90;->i2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/xo90;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/xo90;-><init>(La/zo90;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/wz80;

    .line 19
    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v4, La/wz80;

    .line 28
    .line 29
    const/16 v5, 0xb

    .line 30
    .line 31
    invoke-direct {v4, v1, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v4, La/es90;

    .line 39
    .line 40
    sget-object v6, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v6, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v6, La/a190;

    .line 47
    .line 48
    invoke-direct {v6, v1, v2}, La/a190;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v2, La/a190;

    .line 52
    .line 53
    invoke-direct {v2, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v4, v6, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/zo90;->j2:La/kiu0;

    .line 61
    .line 62
    new-instance v0, La/xo90;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-direct {v0, p0, v1}, La/xo90;-><init>(La/zo90;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/zo90;->k2:La/n0o0;

    .line 73
    .line 74
    new-instance v0, La/xo90;

    .line 75
    .line 76
    const/4 v1, 0x2

    .line 77
    invoke-direct {v0, p0, v1}, La/xo90;-><init>(La/zo90;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/zo90;->l2:La/a8z;

    .line 85
    .line 86
    new-instance v0, La/xo90;

    .line 87
    .line 88
    const/4 v1, 0x3

    .line 89
    invoke-direct {v0, p0, v1}, La/xo90;-><init>(La/zo90;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 93
    .line 94
    .line 95
    new-instance v0, La/khf0;

    .line 96
    .line 97
    const-string v1, "KEY_PARAMS"

    .line 98
    .line 99
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/zo90;->m2:La/khf0;

    .line 103
    .line 104
    new-instance v0, La/phf0;

    .line 105
    .line 106
    const-string v1, "CUSTOM_REQUEST_KEY"

    .line 107
    .line 108
    const-string v2, ""

    .line 109
    .line 110
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, La/zo90;->n2:La/phf0;

    .line 114
    .line 115
    new-instance v0, La/khf0;

    .line 116
    .line 117
    const-string v1, "ANALYTICS_ENTRY_POINT_KEY"

    .line 118
    .line 119
    sget-object v2, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 120
    .line 121
    invoke-direct {v0, v2, v1}, La/khf0;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, La/zo90;->o2:La/khf0;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final B0()I
    .locals 0

    .line 1
    const p0, 0x7f1405a1

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/stl;->C0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/djk;->a:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    new-instance v1, Lkotlin/Pair;

    .line 29
    .line 30
    const-string v3, "PICKER_DIALOG_TAG"

    .line 31
    .line 32
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, p0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v1, La/w23;

    .line 48
    .line 49
    invoke-direct {v1, p0, v2}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, La/djk;->h:Landroid/widget/TextView;

    .line 60
    .line 61
    new-instance v1, La/wo90;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v1, p0, v3}, La/wo90;-><init>(La/zo90;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/djk;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 75
    .line 76
    new-instance v1, La/wo90;

    .line 77
    .line 78
    const/4 v3, 0x1

    .line 79
    invoke-direct {v1, p0, v3}, La/wo90;-><init>(La/zo90;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v0, v0, La/djk;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    iget-object v1, p0, La/zo90;->k2:La/n0o0;

    .line 92
    .line 93
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/vn90;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v0, v0, La/djk;->f:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 107
    .line 108
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->clearFocus()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v0, v0, La/djk;->a:Landroid/widget/LinearLayout;

    .line 116
    .line 117
    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v0, v0, La/djk;->a:Landroid/widget/LinearLayout;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v0, v0, La/djk;->f:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 134
    .line 135
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Landroid/widget/TextView;->getFilters()[Landroid/text/InputFilter;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v5, La/tpb;

    .line 147
    .line 148
    invoke-direct {v5, v3}, La/tpb;-><init>(B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v5, v4}, La/qx3;->q(Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, [Landroid/text/InputFilter;

    .line 156
    .line 157
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v3, La/jt6;

    .line 165
    .line 166
    invoke-direct {v3, p0, v2}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v1, La/jw5;

    .line 177
    .line 178
    invoke-direct {v1, p0, v2}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, La/zo90;->V0()La/djk;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget-object v0, v0, La/djk;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 189
    .line 190
    new-instance v1, La/pl70;

    .line 191
    .line 192
    const/16 v2, 0x15

    .line 193
    .line 194
    invoke-direct {v1, v0, v2}, La/pl70;-><init>(Ljava/lang/Object;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setOnTextPaste(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    const/4 v1, 0x3

    .line 201
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setTextDirection(I)V

    .line 202
    .line 203
    .line 204
    const/4 v1, 0x6

    .line 205
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setImeOptions(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getFilters()[Landroid/text/InputFilter;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    new-instance v3, La/tpb;

    .line 213
    .line 214
    const/4 v4, 0x2

    .line 215
    invoke-direct {v3, v4}, La/tpb;-><init>(B)V

    .line 216
    .line 217
    .line 218
    invoke-static {v3, v2}, La/qx3;->q(Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, [Landroid/text/InputFilter;

    .line 223
    .line 224
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setFilters([Landroid/text/InputFilter;)V

    .line 225
    .line 226
    .line 227
    new-instance v2, La/jt6;

    .line 228
    .line 229
    new-instance v3, La/csw;

    .line 230
    .line 231
    invoke-direct {v3, p0, v1}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 232
    .line 233
    .line 234
    const/16 p0, 0xb

    .line 235
    .line 236
    invoke-direct {v2, v3, p0}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 240
    .line 241
    .line 242
    return-void
.end method

.method public final T0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/ap90;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/ap90;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/ap90;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/zo90;->q2:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/zo90;->m2:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 67
    .line 68
    const/4 v3, 0x3

    .line 69
    aget-object v1, v1, v3

    .line 70
    .line 71
    iget-object v3, p0, La/zo90;->o2:La/khf0;

    .line 72
    .line 73
    invoke-virtual {v3, p0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 78
    .line 79
    invoke-virtual {v2, v0, v1}, La/ap90;->a(Lorg/xplatform/picker/api/presentation/PickerParams;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)La/sni;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v1, v0, La/sni;->l:La/n5d0;

    .line 84
    .line 85
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, La/pni;

    .line 90
    .line 91
    iput-object v1, p0, La/zo90;->g2:La/pni;

    .line 92
    .line 93
    iget-object v0, v0, La/sni;->m:La/n5d0;

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/qni;

    .line 100
    .line 101
    iput-object v0, p0, La/zo90;->h2:La/qni;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 105
    .line 106
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final U0()V
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, La/zo90;->W0()La/es90;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/es90;->i:La/g090;

    .line 6
    .line 7
    iget-object v1, v1, La/g090;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/p7m0;

    .line 10
    .line 11
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, La/m430;

    .line 16
    .line 17
    const/16 v3, 0x16

    .line 18
    .line 19
    invoke-direct {v2, v1, v0, v3}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v4, La/hi70;

    .line 23
    .line 24
    const/4 v10, 0x4

    .line 25
    const/16 v11, 0x13

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const-class v15, La/zo90;

    .line 29
    .line 30
    const-string v8, "handleUiState"

    .line 31
    .line 32
    const-string v9, "handleUiState(Lorg/xplatform/picker/impl/presentation/PickerUiState;)V"

    .line 33
    .line 34
    move-object/from16 v6, p0

    .line 35
    .line 36
    move-object v7, v15

    .line 37
    invoke-direct/range {v4 .. v11}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 38
    .line 39
    .line 40
    sget-object v0, La/lkz;->a:La/lkz;

    .line 41
    .line 42
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v3, La/w090;

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-direct {v3, v2, v0, v4, v5}, La/w090;-><init>(La/m430;La/clz;La/hi70;La/yje;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    invoke-static {v1, v5, v5, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {p0 .. p0}, La/zo90;->W0()La/es90;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v1, v1, La/es90;->k:La/p7m0;

    .line 69
    .line 70
    new-instance v2, La/wk30;

    .line 71
    .line 72
    const/16 v3, 0xe

    .line 73
    .line 74
    invoke-direct {v2, v1, v3}, La/wk30;-><init>(La/gmq;B)V

    .line 75
    .line 76
    .line 77
    new-instance v12, La/hi70;

    .line 78
    .line 79
    const/16 v18, 0x4

    .line 80
    .line 81
    const/16 v19, 0x14

    .line 82
    .line 83
    const/4 v13, 0x2

    .line 84
    const-string v16, "handleAuthPickerEvent"

    .line 85
    .line 86
    const-string v17, "handleAuthPickerEvent(Lorg/xplatform/picker/impl/presentation/PickerEvent;)V"

    .line 87
    .line 88
    move-object/from16 v14, p0

    .line 89
    .line 90
    invoke-direct/range {v12 .. v19}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 91
    .line 92
    .line 93
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v4, La/w090;

    .line 106
    .line 107
    invoke-direct {v4, v2, v1, v12, v5}, La/w090;-><init>(La/wk30;La/clz;La/hi70;La/yje;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final V0()La/djk;
    .locals 2

    .line 1
    sget-object v0, La/zo90;->q2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/zo90;->i2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/djk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W0()La/es90;
    .locals 0

    .line 1
    iget-object p0, p0, La/zo90;->j2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/es90;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/zo90;->l2:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/po8;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/stl;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/zo90;->l2:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/po8;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y(La/po8;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    new-instance v0, Lkotlin/Pair;

    .line 10
    .line 11
    const-string v1, "PICKER_DIALOG_TAG"

    .line 12
    .line 13
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
