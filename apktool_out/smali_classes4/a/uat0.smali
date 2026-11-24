.class public final La/uat0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uat0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uxs0",
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
.field public static final Q1:La/uxs0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:Z

.field public M1:La/fiu0;

.field public final N1:La/a8z;

.field public final O1:La/qdz;

.field public final P1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/uat0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/uat0;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/uxs0;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/uat0;->Q1:La/uxs0;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/uat0;->K1:La/e9o0;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, La/uat0;->L1:Z

    .line 24
    .line 25
    const-class v0, La/yat0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/tat0;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/tat0;-><init>(La/uat0;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/uat0;->N1:La/a8z;

    .line 44
    .line 45
    new-instance v0, La/qdz;

    .line 46
    .line 47
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/uat0;->O1:La/qdz;

    .line 51
    .line 52
    new-instance v0, La/khf0;

    .line 53
    .line 54
    const-string v1, "UNIVERSAL_CHAMP_PARAMS"

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/uat0;->P1:La/khf0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 9

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
    const-class v1, La/vat0;

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
    instance-of v3, v0, La/vat0;

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
    check-cast v2, La/vat0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/uat0;->R1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/uat0;->P1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;

    .line 67
    .line 68
    iget-object v1, v2, La/vat0;->a:La/cad;

    .line 69
    .line 70
    iget-object v3, v2, La/vat0;->b:La/pyg;

    .line 71
    .line 72
    iget-object v4, v2, La/vat0;->c:La/ctf0;

    .line 73
    .line 74
    iget-object v5, v2, La/vat0;->d:La/g2v;

    .line 75
    .line 76
    iget-object v6, v2, La/vat0;->e:La/m1e;

    .line 77
    .line 78
    iget-object v7, v2, La/vat0;->f:La/gii0;

    .line 79
    .line 80
    iget-object v2, v2, La/vat0;->g:La/vby;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v8, La/g45;

    .line 98
    .line 99
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v0, v8, La/g45;->a:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v1, v8, La/g45;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v5, v8, La/g45;->c:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v3, v8, La/g45;->d:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v6, v8, La/g45;->e:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v7, v8, La/g45;->f:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v2, v8, La/g45;->g:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v4, v8, La/g45;->h:Ljava/lang/Object;

    .line 117
    .line 118
    new-instance v0, La/yxi;

    .line 119
    .line 120
    const/16 v1, 0xc

    .line 121
    .line 122
    invoke-direct {v0, v8, v1}, La/yxi;-><init>(Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    iput-object v0, v8, La/g45;->i:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v0, La/fiu0;

    .line 128
    .line 129
    iget-object v1, v8, La/g45;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, La/yxi;

    .line 132
    .line 133
    const-class v2, La/yat0;

    .line 134
    .line 135
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 140
    .line 141
    .line 142
    iput-object v0, p0, La/uat0;->M1:La/fiu0;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 146
    .line 147
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/owp0;

    .line 16
    .line 17
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, La/p6r0;

    .line 21
    .line 22
    const/16 v1, 0x1c

    .line 23
    .line 24
    invoke-direct {p3, p0, v1}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ugd;

    .line 28
    .line 29
    const v1, 0x2fa35e61

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/uat0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/uat0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
