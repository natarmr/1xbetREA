.class public final synthetic La/ngx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/udl0;

.field public final synthetic d:Z

.field public final synthetic e:La/xcz;

.field public final synthetic f:La/hh80;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:La/xdr;

.field public final synthetic j:S

.field public final synthetic k:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pz40;La/udl0;ZLa/xcz;La/hh80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ngx;->a:La/mm40;

    iput-object p2, p0, La/ngx;->b:La/pz40;

    iput-object p3, p0, La/ngx;->c:La/udl0;

    iput-boolean p4, p0, La/ngx;->d:Z

    iput-object p5, p0, La/ngx;->e:La/xcz;

    iput-object p6, p0, La/ngx;->f:La/hh80;

    iput-object p7, p0, La/ngx;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, La/ngx;->h:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/ngx;->i:La/xdr;

    iput-short p10, p0, La/ngx;->j:S

    iput-byte p11, p0, La/ngx;->k:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, La/ngx;->j:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, La/ngx;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/ngx;->b:La/pz40;

    .line 20
    .line 21
    iget-object v2, p0, La/ngx;->c:La/udl0;

    .line 22
    .line 23
    iget-boolean v3, p0, La/ngx;->d:Z

    .line 24
    .line 25
    iget-object v4, p0, La/ngx;->e:La/xcz;

    .line 26
    .line 27
    iget-object v5, p0, La/ngx;->f:La/hh80;

    .line 28
    .line 29
    iget-object v6, p0, La/ngx;->g:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-object v7, p0, La/ngx;->h:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v8, p0, La/ngx;->i:La/xdr;

    .line 34
    .line 35
    iget-byte v11, p0, La/ngx;->k:B

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, La/fww;->c(La/mm40;La/pz40;La/udl0;ZLa/xcz;La/hh80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
