.class public final La/nqt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nqt;->a:La/pbt;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/w05;
    .locals 2

    .line 1
    iget-object p0, p0, La/nqt;->a:La/pbt;

    .line 2
    .line 3
    iget-object p0, p0, La/pbt;->b:La/lsn;

    .line 4
    .line 5
    iget-object p0, p0, La/lsn;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/SharedPreferences;

    .line 8
    .line 9
    const-string v0, "autoSpinAmount"

    .line 10
    .line 11
    const-string v1, "AUTOSPIN_5"

    .line 12
    .line 13
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, p0

    .line 21
    :goto_0
    invoke-static {v1}, La/w05;->valueOf(Ljava/lang/String;)La/w05;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
