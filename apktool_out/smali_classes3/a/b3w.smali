.class public final La/b3w;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/c3w;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/b3w;",
        "La/nw5;",
        "La/c3w;",
        "<init>",
        "()V",
        "a/rqt",
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
.field public static final h2:La/rqt;

.field public static final synthetic i2:[La/iiy;


# instance fields
.field public final e2:La/khf0;

.field public final f2:La/phf0;

.field public final g2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/b3w;

    .line 4
    .line 5
    const-string v2, "bundleItem"

    .line 6
    .line 7
    const-string v3, "getBundleItem()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "title"

    .line 16
    .line 17
    const-string v5, "getTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryInfoDialogBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/b3w;->i2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/rqt;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/b3w;->h2:La/rqt;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "BUNDLE_ITEM"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/b3w;->e2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "BUNDLE_TITLE"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/b3w;->f2:La/phf0;

    .line 21
    .line 22
    sget-object v0, La/a3w;->a:La/a3w;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/b3w;->g2:La/nae0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/b3w;->T0()La/c3w;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/b3w;->T0()La/c3w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c3w;->d:Landroid/widget/TextView;

    .line 6
    .line 7
    sget-object v1, La/b3w;->i2:[La/iiy;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aget-object v1, v1, v2

    .line 11
    .line 12
    iget-object v2, p0, La/b3w;->f2:La/phf0;

    .line 13
    .line 14
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v2, v2, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->c:Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, " - "

    .line 37
    .line 38
    invoke-static {v1, v3, v2}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/b3w;->T0()La/c3w;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/c3w;->b:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget v1, v1, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->a:I

    .line 56
    .line 57
    sget-object v2, La/pn40;->a:La/pn40;

    .line 58
    .line 59
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-wide v2, v2, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->d:D

    .line 64
    .line 65
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    iget-object v4, v4, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->g:Ljava/lang/String;

    .line 70
    .line 71
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 72
    .line 73
    invoke-static {v2, v3, v4, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, " ("

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ")"

    .line 94
    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, La/b3w;->T0()La/c3w;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, La/c3w;->c:Landroid/widget/TextView;

    .line 110
    .line 111
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-wide v1, v1, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->e:D

    .line 116
    .line 117
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget-object v3, v3, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->g:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v1, v2, v3, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, La/b3w;->T0()La/c3w;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v0, v0, La/c3w;->e:Landroid/widget/TextView;

    .line 135
    .line 136
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iget-wide v1, v1, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->f:D

    .line 141
    .line 142
    invoke-virtual {p0}, La/b3w;->U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    iget-object p0, p0, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;->g:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v1, v2, p0, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f1306d1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final T0()La/c3w;
    .locals 2

    .line 1
    sget-object v0, La/b3w;->i2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b3w;->g2:La/nae0;

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
    check-cast p0, La/c3w;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;
    .locals 2

    .line 1
    sget-object v0, La/b3w;->i2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b3w;->e2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 13
    .line 14
    return-object p0
.end method
