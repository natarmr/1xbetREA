.class public final synthetic La/r57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I

.field public final synthetic c:La/fqj0;

.field public final synthetic d:F


# direct methods
.method public synthetic constructor <init>(ZILa/fqj0;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/r57;->a:Z

    iput p2, p0, La/r57;->b:I

    iput-object p3, p0, La/r57;->c:La/fqj0;

    iput p4, p0, La/r57;->d:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/hcz;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iget-boolean v1, p0, La/r57;->a:Z

    .line 9
    .line 10
    iget-object v2, p0, La/r57;->c:La/fqj0;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, La/t57;

    .line 16
    .line 17
    invoke-direct {v1, v2, p1}, La/t57;-><init>(La/fqj0;B)V

    .line 18
    .line 19
    .line 20
    new-instance v4, La/ugd;

    .line 21
    .line 22
    const v5, 0x313e0c15

    .line 23
    .line 24
    .line 25
    invoke-direct {v4, v5, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-static {v0, v5, v5, v4, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    new-instance v1, La/u57;

    .line 34
    .line 35
    iget v4, p0, La/r57;->d:F

    .line 36
    .line 37
    invoke-direct {v1, v4, v2, p1}, La/u57;-><init>(FLa/fqj0;B)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/ugd;

    .line 41
    .line 42
    const p1, -0x413276fd

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, p1, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 v5, 0x6

    .line 49
    iget v1, p0, La/r57;->b:I

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0
.end method
