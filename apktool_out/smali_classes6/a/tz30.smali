.class public final synthetic La/tz30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fqj0;


# direct methods
.method public synthetic constructor <init>(ILa/fqj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, La/tz30;->a:B

    iput-object p2, p0, La/tz30;->b:La/fqj0;

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
    new-instance p1, La/uz30;

    .line 8
    .line 9
    iget-byte v1, p0, La/tz30;->a:B

    .line 10
    .line 11
    iget-object p0, p0, La/tz30;->b:La/fqj0;

    .line 12
    .line 13
    invoke-direct {p1, v1, p0}, La/uz30;-><init>(ILa/fqj0;)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/ugd;

    .line 17
    .line 18
    const p0, -0x2bf9428e

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v4, p0, v2, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x6

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method
