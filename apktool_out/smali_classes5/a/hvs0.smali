.class public final La/hvs0;
.super La/sik;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hvs0;",
        "La/sik;",
        "<init>",
        "()V",
        "a/s9m0",
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
.field public static final c2:La/s9m0;

.field public static final synthetic d2:[La/iiy;


# instance fields
.field public final Y1:La/s0r;

.field public final Z1:La/a8z;

.field public final a2:La/kiu0;

.field public final b2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/hvs0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/security/impl/databinding/DialogTwoFactorAuthenticationQrCodeBinding;"

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
    const-string v3, "authString"

    .line 16
    .line 17
    const-string v5, "getAuthString()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/hvs0;->d2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/s9m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/hvs0;->c2:La/s9m0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d015e

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/sik;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/gvs0;->a:La/gvs0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/hvs0;->Y1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/fvs0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, La/fvs0;-><init>(La/hvs0;B)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/wez;->b:La/wez;

    .line 22
    .line 23
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/hvs0;->Z1:La/a8z;

    .line 28
    .line 29
    new-instance v0, La/fvs0;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v0, p0, v2}, La/fvs0;-><init>(La/hvs0;B)V

    .line 33
    .line 34
    .line 35
    new-instance v2, La/cvs0;

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    invoke-direct {v2, p0, v3}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance v3, La/cvs0;

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    invoke-direct {v3, v2, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-class v2, La/jvs0;

    .line 52
    .line 53
    sget-object v3, La/sre0;->a:La/tre0;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, La/p7r0;

    .line 60
    .line 61
    const/16 v4, 0x1a

    .line 62
    .line 63
    invoke-direct {v3, v1, v4}, La/p7r0;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    new-instance v4, La/p7r0;

    .line 67
    .line 68
    const/16 v5, 0x1b

    .line 69
    .line 70
    invoke-direct {v4, v1, v5}, La/p7r0;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/hvs0;->a2:La/kiu0;

    .line 78
    .line 79
    new-instance v0, La/phf0;

    .line 80
    .line 81
    const-string v1, "authString"

    .line 82
    .line 83
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, La/hvs0;->b2:La/phf0;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final I0()La/rjk;
    .locals 2

    .line 1
    sget-object v0, La/hvs0;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hvs0;->Y1:La/s0r;

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
    check-cast p0, La/rjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/hvs0;->I0()La/rjk;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p1, p1, La/rjk;->b:Landroid/widget/ImageView;

    .line 9
    .line 10
    new-instance p2, La/jpe0;

    .line 11
    .line 12
    const/16 v0, 0xf

    .line 13
    .line 14
    invoke-direct {p2, p0, v0}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/hvs0;->I0()La/rjk;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/rjk;->c:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    instance-of p2, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p1, v0

    .line 39
    :goto_0
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    const/4 p2, -0x1

    .line 61
    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setLayout(II)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {p2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object p1, p0, La/hvs0;->a2:La/kiu0;

    .line 74
    .line 75
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, La/jvs0;

    .line 80
    .line 81
    new-instance p2, La/meq0;

    .line 82
    .line 83
    const/16 v1, 0x1b

    .line 84
    .line 85
    invoke-direct {p2, p1, v0, v1}, La/meq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 86
    .line 87
    .line 88
    new-instance p1, La/vsg0;

    .line 89
    .line 90
    invoke-direct {p1, p2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    new-instance p2, La/pyn0;

    .line 94
    .line 95
    const/4 v1, 0x4

    .line 96
    const/4 v2, 0x3

    .line 97
    invoke-direct {p2, v2, v0, v1}, La/pyn0;-><init>(ILa/yje;B)V

    .line 98
    .line 99
    .line 100
    new-instance v1, La/dnq;

    .line 101
    .line 102
    const/4 v3, 0x1

    .line 103
    invoke-direct {v1, p1, p2, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 104
    .line 105
    .line 106
    sget-object p1, La/lkz;->a:La/lkz;

    .line 107
    .line 108
    new-instance v3, La/k5r0;

    .line 109
    .line 110
    invoke-virtual {p0}, La/hvs0;->I0()La/rjk;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v5, p1, La/rjk;->c:Landroid/widget/ImageView;

    .line 115
    .line 116
    const/4 v9, 0x4

    .line 117
    const/16 v10, 0xb

    .line 118
    .line 119
    const/4 v4, 0x2

    .line 120
    const-class v6, Landroid/widget/ImageView;

    .line 121
    .line 122
    const-string v7, "setImageBitmap"

    .line 123
    .line 124
    const-string v8, "setImageBitmap(Landroid/graphics/Bitmap;)V"

    .line 125
    .line 126
    invoke-direct/range {v3 .. v10}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance p2, La/tsr0;

    .line 142
    .line 143
    invoke-direct {p2, v1, p0, v3, v0}, La/tsr0;-><init>(La/dnq;La/clz;La/k5r0;La/yje;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1, v0, v0, p2, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 147
    .line 148
    .line 149
    return-void
.end method
