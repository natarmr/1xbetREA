.class public final La/hgc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hb50;


# instance fields
.field public final synthetic a:La/sgy;

.field public final synthetic b:La/sfc;

.field public final synthetic c:La/fwv0;

.field public final synthetic d:La/jiy;


# direct methods
.method public constructor <init>(La/sgy;La/sfc;La/fwv0;La/jiy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hgc;->a:La/sgy;

    .line 5
    .line 6
    iput-object p2, p0, La/hgc;->b:La/sfc;

    .line 7
    .line 8
    iput-object p3, p0, La/hgc;->c:La/fwv0;

    .line 9
    .line 10
    iput-object p4, p0, La/hgc;->d:La/jiy;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/nw20;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/hgc;->a:La/sgy;

    .line 2
    .line 3
    iget-object p0, p0, La/hgc;->d:La/jiy;

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(La/phf0;)V
    .locals 6

    .line 1
    sget-object v0, La/i13;->v:La/i13;

    .line 2
    .line 3
    sget-object v1, La/i13;->w:La/i13;

    .line 4
    .line 5
    new-instance v2, La/ggc;

    .line 6
    .line 7
    iget-object v3, p0, La/hgc;->b:La/sfc;

    .line 8
    .line 9
    iget-object v4, p0, La/hgc;->c:La/fwv0;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    invoke-direct {v2, v3, v4, v5}, La/ggc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/ugd;

    .line 16
    .line 17
    const v4, -0x2db74759

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v4, v5, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/hgc;->a:La/sgy;

    .line 24
    .line 25
    invoke-virtual {p1, p0, v0, v1, v3}, La/phf0;->a(La/sgy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
