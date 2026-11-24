.class public final La/ue60;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public final synthetic o:La/ve60;


# direct methods
.method public constructor <init>(La/ve60;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ue60;->o:La/ve60;

    .line 2
    .line 3
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget p3, p2, La/pu90;->a:I

    .line 9
    .line 10
    iget p4, p2, La/pu90;->b:I

    .line 11
    .line 12
    new-instance v0, La/rw40;

    .line 13
    .line 14
    const/16 v1, 0x15

    .line 15
    .line 16
    iget-object p0, p0, La/ue60;->o:La/ve60;

    .line 17
    .line 18
    invoke-direct {v0, p0, p2, v1}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p3, p4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
