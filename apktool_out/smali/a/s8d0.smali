.class public final synthetic La/s8d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ilq;


# instance fields
.field public final synthetic a:La/d9d0;


# direct methods
.method public synthetic constructor <init>(La/d9d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s8d0;->a:La/d9d0;

    return-void
.end method


# virtual methods
.method public final invoke()F
    .locals 0

    .line 1
    iget-object p0, p0, La/s8d0;->a:La/d9d0;

    .line 2
    .line 3
    iget-object p0, p0, La/d9d0;->a:La/t33;

    .line 4
    .line 5
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
