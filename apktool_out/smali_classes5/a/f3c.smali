.class public final La/f3c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h03;


# direct methods
.method public synthetic constructor <init>(La/h03;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f3c;->a:La/h03;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/f3c;->a:La/h03;

    .line 2
    .line 3
    iget-object p0, p0, La/h03;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/nb7;

    .line 6
    .line 7
    iget-object p0, p0, La/nb7;->a:La/p7m0;

    .line 8
    .line 9
    new-instance v0, La/i89;

    .line 10
    .line 11
    const/16 v1, 0x16

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
