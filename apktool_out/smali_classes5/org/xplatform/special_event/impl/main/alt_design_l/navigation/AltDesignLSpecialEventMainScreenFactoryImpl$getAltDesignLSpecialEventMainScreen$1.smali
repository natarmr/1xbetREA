.class public final Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;
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
        "org/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1",
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
.field public final synthetic a:La/a92;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/a92;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;->a:La/a92;

    .line 5
    .line 6
    iput p2, p0, Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;->c:Ljava/lang/String;

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
    sget-object p1, La/y82;->V1:La/qek0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/y82;

    .line 15
    .line 16
    invoke-direct {v0}, La/y82;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/y82;->W1:[La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aget-object v2, v1, v2

    .line 23
    .line 24
    iget-object v3, v0, La/y82;->N1:La/zz2;

    .line 25
    .line 26
    iget p0, p0, Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;->b:I

    .line 27
    .line 28
    invoke-virtual {v3, v0, v2, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    aget-object p0, v1, p0

    .line 33
    .line 34
    iget-object v1, v0, La/y82;->O1:La/phf0;

    .line 35
    .line 36
    invoke-virtual {v1, v0, p0, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/special_event/impl/main/alt_design_l/navigation/AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1;->a:La/a92;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/y82;->V1:La/qek0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, La/y82;->X1:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
