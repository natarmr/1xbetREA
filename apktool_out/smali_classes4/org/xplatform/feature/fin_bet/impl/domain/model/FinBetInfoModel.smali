.class public final Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;",
        "Landroid/os/Parcelable;",
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
            "Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:D

.field public final d:Ljava/lang/String;

.field public final e:La/fcq;

.field public final f:D

.field public final g:I

.field public final h:J

.field public final i:D

.field public final j:D

.field public final k:Z

.field public final l:I

.field public final m:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/yoo;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/yoo;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;DLjava/lang/String;La/fcq;DIJDDZIJ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    .line 14
    .line 15
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->c:D

    .line 18
    .line 19
    iput-object p5, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p6, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    .line 22
    .line 23
    iput-wide p7, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    .line 24
    .line 25
    iput p9, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    .line 26
    .line 27
    iput-wide p10, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    .line 28
    .line 29
    iput-wide p12, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    .line 30
    .line 31
    iput-wide p14, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    .line 32
    .line 33
    move/from16 p1, p16

    .line 34
    .line 35
    iput-boolean p1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 36
    .line 37
    move/from16 p1, p17

    .line 38
    .line 39
    iput p1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->l:I

    .line 40
    .line 41
    move-wide/from16 p1, p18

    .line 42
    .line 43
    iput-wide p1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    iget v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    iget v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->b:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->c:D

    iget-wide v5, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->c:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    iget-object v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    iget-wide v5, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    iget v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    iget-wide v5, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    iget-wide v5, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    iget-wide v5, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    iget-boolean v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->l:I

    iget v3, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->l:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    iget-wide p0, p1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    cmp-long p0, v3, p0

    if-eqz p0, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->c:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    .line 37
    .line 38
    invoke-static {v3, v4, v2, v1}, La/brm0;->d(DII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    .line 55
    .line 56
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    .line 61
    .line 62
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->l:I

    .line 73
    .line 74
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-wide v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    .line 79
    .line 80
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v0

    .line 85
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", coefViewName="

    .line 2
    .line 3
    const-string v1, ", coef="

    .line 4
    .line 5
    iget v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    .line 6
    .line 7
    const-string v3, "FinBetInfoModel(instrumentId="

    .line 8
    .line 9
    iget-object v4, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", instrumentName="

    .line 16
    .line 17
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->c:D

    .line 18
    .line 19
    iget-object v4, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v2, v3, v1, v4}, La/hne;->w(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", instrumentType="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", price="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", decimals="

    .line 40
    .line 41
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    .line 42
    .line 43
    iget v4, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    .line 44
    .line 45
    invoke-static {v0, v2, v3, v1, v4}, La/rz4;->w(Ljava/lang/StringBuilder;DLjava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", seconds="

    .line 49
    .line 50
    const-string v2, ", higherCoefficient="

    .line 51
    .line 52
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    .line 53
    .line 54
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-wide v1, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", lowerCoefficient="

    .line 63
    .line 64
    const-string v2, ", higher="

    .line 65
    .line 66
    iget-wide v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    .line 67
    .line 68
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v1, ", index="

    .line 72
    .line 73
    const-string v2, ", closeTime="

    .line 74
    .line 75
    iget v3, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->l:I

    .line 76
    .line 77
    iget-boolean v4, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 78
    .line 79
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 80
    .line 81
    .line 82
    const-string v1, ")"

    .line 83
    .line 84
    iget-wide v2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    .line 85
    .line 86
    invoke-static {v2, v3, v1, v0}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->a:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->c:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->e:La/fcq;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->f:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->h:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->i:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->j:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-boolean p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->l:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->m:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
