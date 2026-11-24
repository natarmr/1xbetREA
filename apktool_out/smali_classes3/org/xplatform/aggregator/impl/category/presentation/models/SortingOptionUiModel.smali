.class public final Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/xplatform/aggregator/impl/category/presentation/models/FilterItemUi;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;",
        "Lorg/xplatform/aggregator/impl/category/presentation/models/FilterItemUi;",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/lbi0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/lbi0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p4, p5}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p6, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    .line 12
    .line 13
    iput-object p3, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final O(Z)Lorg/xplatform/aggregator/impl/category/presentation/models/FilterItemUi;
    .locals 7

    .line 1
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v4, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v5, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;

    .line 22
    .line 23
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    .line 24
    .line 25
    move v6, p1

    .line 26
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;

    iget-object v1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    iget-boolean v3, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    iget-object p1, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_0
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object v2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final r()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", name="

    .line 2
    .line 3
    const-string v1, ", checked="

    .line 4
    .line 5
    const-string v2, "SortingOptionUiModel(id="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", imageLink="

    .line 16
    .line 17
    const-string v2, ", attribute="

    .line 18
    .line 19
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    .line 22
    .line 23
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", direction="

    .line 27
    .line 28
    const-string v2, ")"

    .line 29
    .line 30
    iget-object v3, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, p0, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final v()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->c:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/presentation/models/SortingOptionUiModel;->f:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
