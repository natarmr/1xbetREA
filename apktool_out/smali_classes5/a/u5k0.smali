.class public final synthetic La/u5k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/Map;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u5k0;->a:Ljava/lang/String;

    iput-object p2, p0, La/u5k0;->b:Ljava/lang/String;

    iput p3, p0, La/u5k0;->c:I

    iput-object p4, p0, La/u5k0;->d:Ljava/util/Map;

    iput-object p5, p0, La/u5k0;->e:Ljava/lang/String;

    iput-object p6, p0, La/u5k0;->f:Ljava/lang/String;

    iput-object p7, p0, La/u5k0;->g:Ljava/lang/String;

    iput-object p8, p0, La/u5k0;->h:Ljava/lang/String;

    iput-object p9, p0, La/u5k0;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/y5k0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, La/y5k0;->b()La/y5k0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/16 v20, 0x0

    .line 15
    .line 16
    const v21, 0x1f007f

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    iget-object v8, v0, La/u5k0;->a:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v9, v0, La/u5k0;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget v10, v0, La/u5k0;->c:I

    .line 29
    .line 30
    iget-object v11, v0, La/u5k0;->d:Ljava/util/Map;

    .line 31
    .line 32
    iget-object v12, v0, La/u5k0;->e:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v13, v0, La/u5k0;->f:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v14, v0, La/u5k0;->g:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v15, v0, La/u5k0;->h:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v0, v0, La/u5k0;->i:Ljava/lang/String;

    .line 41
    .line 42
    const/16 v17, 0x0

    .line 43
    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    move-object/from16 v16, v0

    .line 49
    .line 50
    invoke-static/range {v2 .. v21}, La/y5k0;->a(La/y5k0;Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;La/m6k0;ZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZI)La/y5k0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method
