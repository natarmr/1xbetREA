.class public abstract Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;,
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;,
        Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;",
        "Landroid/os/Parcelable;",
        "Companion",
        "Real",
        "Virtual",
        "OneXCyber",
        "a/zzg",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;",
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
.field public static final Companion:La/zzg;

.field public static final b:La/a8z;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/zzg;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->Companion:La/zzg;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/xng;

    .line 11
    .line 12
    const/16 v2, 0x8

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
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->b:La/a8z;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 5
    .line 6
    return-void
.end method
