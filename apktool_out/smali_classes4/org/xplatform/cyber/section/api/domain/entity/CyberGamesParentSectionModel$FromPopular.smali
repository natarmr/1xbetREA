.class public final Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;
.super Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FromPopular"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;",
        "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;",
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
            "Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

.field public static final synthetic b:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 7
    .line 8
    new-instance v0, Lorg/xplatform/cyber/section/api/domain/entity/h;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 14
    .line 15
    sget-object v0, La/wez;->a:La/wez;

    .line 16
    .line 17
    new-instance v1, La/xng;

    .line 18
    .line 19
    const/16 v2, 0x10

    .line 20
    .line 21
    invoke-direct {v1, v2}, La/xng;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;->b:La/a8z;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

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
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;->b:La/a8z;

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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
