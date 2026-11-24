.class public final La/m2c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m2c;->a:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, La/m2c;->a:La/pzu;

    .line 2
    .line 3
    iget-object p0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/h840;

    .line 6
    .line 7
    iget-object v0, p0, La/h840;->g:La/p7m0;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/h840;->h:La/p7m0;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, v2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method
