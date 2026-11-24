.class public final Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
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


# instance fields
.field public final synthetic a:Lorg/xplatform/rules/api/presentation/models/RuleData;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;->a:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 5
    .line 6
    iput p2, p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/bmg0;->Z1:La/zie0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/bmg0;

    .line 10
    .line 11
    invoke-direct {p1}, La/bmg0;-><init>()V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/bmg0;->a2:[La/iiy;

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    aget-object v1, v0, v1

    .line 18
    .line 19
    iget-object v2, p1, La/bmg0;->S1:La/cgx0;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, p1, v1, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p1, La/bmg0;->Q1:La/khf0;

    .line 26
    .line 27
    aget-object v2, v0, v3

    .line 28
    .line 29
    iget-object v3, p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;->a:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 30
    .line 31
    invoke-virtual {v1, p1, v2, v3}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p1, La/bmg0;->R1:La/zz2;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    aget-object v2, v0, v2

    .line 38
    .line 39
    iget v3, p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;->b:I

    .line 40
    .line 41
    invoke-virtual {v1, p1, v2, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p1, La/bmg0;->U1:La/cgx0;

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    aget-object v2, v0, v2

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v1, p1, v2, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x5

    .line 54
    aget-object v1, v0, v1

    .line 55
    .line 56
    iget-object v2, p1, La/bmg0;->V1:La/cgx0;

    .line 57
    .line 58
    iget-boolean p0, p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;->c:Z

    .line 59
    .line 60
    invoke-virtual {v2, p1, v1, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x6

    .line 64
    aget-object p0, v0, p0

    .line 65
    .line 66
    iget-object v1, p1, La/bmg0;->W1:La/cgx0;

    .line 67
    .line 68
    invoke-virtual {v1, p1, p0, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x7

    .line 72
    aget-object p0, v0, p0

    .line 73
    .line 74
    iget-object v0, p1, La/bmg0;->X1:La/cgx0;

    .line 75
    .line 76
    invoke-virtual {v0, p1, p0, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
