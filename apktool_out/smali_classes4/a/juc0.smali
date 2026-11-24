.class public final synthetic La/juc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:La/ugg0;

.field public final synthetic d:La/fqj0;


# direct methods
.method public synthetic constructor <init>(IFLa/ugg0;La/fqj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/juc0;->a:I

    iput p2, p0, La/juc0;->b:F

    iput-object p3, p0, La/juc0;->c:La/ugg0;

    iput-object p4, p0, La/juc0;->d:La/fqj0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/i8z;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p1, La/yjm;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    iget v2, p0, La/juc0;->b:F

    .line 11
    .line 12
    iget-object v3, p0, La/juc0;->c:La/ugg0;

    .line 13
    .line 14
    iget-object v4, p0, La/juc0;->d:La/fqj0;

    .line 15
    .line 16
    invoke-direct {p1, v2, v3, v4, v1}, La/yjm;-><init>(FLjava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/ugd;

    .line 20
    .line 21
    const v1, -0x16838d9b

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v4, v1, v2, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/16 v5, 0xe

    .line 29
    .line 30
    iget v1, p0, La/juc0;->a:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static/range {v0 .. v5}, La/i8z;->f(La/i8z;ILa/oea;La/oea;La/ugd;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method
