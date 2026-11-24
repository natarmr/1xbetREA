.class public abstract Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromGame;,
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;,
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;,
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;,
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0008\u0082\u0001\u0005\t\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;",
        "Landroid/os/Parcelable;",
        "Companion",
        "FromMain",
        "FromPopular",
        "FromNewPopular",
        "FromSection",
        "FromGame",
        "a/a0h",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromGame;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;",
        "api"
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
.field public static final Companion:La/a0h;

.field public static final a:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/a0h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;->Companion:La/a0h;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/xng;

    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/xng;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;->a:La/a8z;

    .line 22
    .line 23
    return-void
.end method
