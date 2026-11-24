.class public final La/i9u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kki;


# direct methods
.method public synthetic constructor <init>(La/kki;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i9u;->a:La/kki;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/i9u;->a:La/kki;

    .line 2
    .line 3
    iget-object p0, p0, La/kki;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/f8p;

    .line 6
    .line 7
    iget-object p0, p0, La/f8p;->b:La/ir30;

    .line 8
    .line 9
    invoke-virtual {p0}, La/ir30;->b()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    return-object p0
.end method
