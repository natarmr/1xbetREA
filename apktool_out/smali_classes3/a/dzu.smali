.class public final La/dzu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pv00;


# direct methods
.method public synthetic constructor <init>(La/pv00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dzu;->a:La/pv00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/dzu;->a:La/pv00;

    .line 2
    .line 3
    iget-object p0, p0, La/pv00;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/ywu;

    .line 6
    .line 7
    iget-object p0, p0, La/ywu;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/vwb0;

    .line 10
    .line 11
    const-string v0, "PREF_IS_QUICK_BETS_ENABLED"

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p0, v0, v1}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method
