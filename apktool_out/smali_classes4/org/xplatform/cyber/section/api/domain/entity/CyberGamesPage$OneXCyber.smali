.class public final Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;
.super Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OneXCyber"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;",
        "La/jiy;",
        "serializer",
        "()La/jiy;",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

.field public static final synthetic c:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 8
    .line 9
    new-instance v0, Lorg/xplatform/cyber/section/api/domain/entity/a;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    sget-object v0, La/wez;->a:La/wez;

    .line 17
    .line 18
    new-instance v1, La/xng;

    .line 19
    .line 20
    const/16 v2, 0x9

    .line 21
    .line 22
    invoke-direct {v1, v2}, La/xng;-><init>(B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->c:La/a8z;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p0, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 0

    const p0, 0x591c5250

    return p0
.end method

.method public final serializer()La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jiy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    const-string p0, "OneXCyber"

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
