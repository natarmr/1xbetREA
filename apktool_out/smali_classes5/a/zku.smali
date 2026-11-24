.class public final La/zku;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w5z;


# direct methods
.method public synthetic constructor <init>(La/w5z;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/zku;->a:La/w5z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/math/BigDecimal;
    .locals 3

    .line 1
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    iget-object p0, p0, La/zku;->a:La/w5z;

    .line 4
    .line 5
    iget-object p0, p0, La/w5z;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gkr0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/gkr0;->a()La/bn7;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-wide v1, p0, La/bn7;->b:D

    .line 14
    .line 15
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
