.class public final La/erc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/erc;->a:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/erc;->a:La/pzu;

    .line 2
    .line 3
    iget-object p0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/h840;

    .line 6
    .line 7
    iget-object p0, p0, La/h840;->f:La/p7m0;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
