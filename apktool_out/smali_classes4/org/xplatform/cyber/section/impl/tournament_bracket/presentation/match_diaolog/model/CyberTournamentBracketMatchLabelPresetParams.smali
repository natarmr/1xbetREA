.class public final Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;",
        "Landroid/os/Parcelable;",
        "Companion",
        "a/xjh",
        "a/yjh",
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
            "Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:La/yjh;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/yjh;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->Companion:La/yjh;

    .line 7
    .line 8
    new-instance v0, La/h9g;

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {v0, v1}, La/h9g;-><init>(B)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object p0, La/xjh;->a:La/xjh;

    .line 15
    .line 16
    invoke-virtual {p0}, La/xjh;->getDescriptor()La/ugi0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

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
    instance-of v1, p1, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    iget-object v1, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    iget-object v3, p1, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    iget-object p1, p1, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", valueText="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    const-string v2, "CyberTournamentBracketMatchLabelPresetParams(label="

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, p0, v1}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
