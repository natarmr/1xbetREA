.class public final La/oeu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/reu;


# direct methods
.method public synthetic constructor <init>(La/reu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/oeu;->a:La/reu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/oeu;->a:La/reu;

    .line 2
    .line 3
    iget-object p0, p0, La/reu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/cih;

    .line 6
    .line 7
    iget-object p0, p0, La/cih;->a:La/q7d0;

    .line 8
    .line 9
    const-string v0, "HAND_SHAKE_ENABLED"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, La/axq;->z(La/q7d0;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
