.class public final La/ivi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

.field public final b:La/sd60;

.field public final c:La/n5d0;


# direct methods
.method public constructor <init>(La/sd60;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/ivi;->a:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 5
    .line 6
    iput-object p1, p0, La/ivi;->b:La/sd60;

    .line 7
    .line 8
    new-instance p1, La/rti;

    .line 9
    .line 10
    const/16 p2, 0x17

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/ivi;->c:La/n5d0;

    .line 20
    .line 21
    return-void
.end method
