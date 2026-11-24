.class public final Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;",
        "Landroid/os/Parcelable;",
        "ui_core"
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
            "Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final f:Ljava/lang/Integer;

.field public final g:I

.field public final h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/h9g;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/h9g;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/lang/Integer;ILorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 26
    .line 27
    iput-object p5, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 28
    .line 29
    iput-object p6, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    .line 30
    .line 31
    iput p7, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    .line 32
    .line 33
    iput-object p8, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->b:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->c:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    iget-object v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    iget-object v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    iget-object v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    iget v3, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object p0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    iget-object p1, p1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 23
    .line 24
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 31
    .line 32
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    const/4 v2, 0x0

    .line 39
    iget-object v3, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    .line 40
    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    move v3, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_0
    add-int/2addr v0, v3

    .line 50
    mul-int/2addr v0, v1

    .line 51
    iget v3, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    .line 52
    .line 53
    invoke-static {v3, v0, v1}, La/twn;->a(III)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object p0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 58
    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :goto_1
    add-int/2addr v0, v2

    .line 67
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", rangeEmptyText="

    .line 2
    .line 3
    const-string v1, ", endRangeEmptyText="

    .line 4
    .line 5
    const-string v2, "DateRangeCalendarBottomSheetParams(title="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", minDate="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", maxDate="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", minDurationDays="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", maxDurationDays="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", initialRange="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p0, ")"

    .line 71
    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 20
    .line 21
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 25
    .line 26
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x1

    .line 39
    invoke-static {p1, v1, v0}, La/kng0;->y(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget v0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 48
    .line 49
    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
