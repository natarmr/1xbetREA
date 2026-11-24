.class public final synthetic La/jlo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sg00;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/jlo;->a:I

    iput p2, p0, La/jlo;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, La/jlo;->b:I

    .line 2
    .line 3
    check-cast p1, La/ky90;

    .line 4
    .line 5
    iget p0, p0, La/jlo;->a:I

    .line 6
    .line 7
    invoke-interface {p1, p0, v0}, La/ky90;->q(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
