.class public final synthetic La/l6k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/l6k0;->a:Ljava/lang/String;

    iput-object p2, p0, La/l6k0;->b:Ljava/lang/Integer;

    iput p1, p0, La/l6k0;->c:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

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
    iget-object v2, v0, La/l6k0;->b:Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v17

    .line 16
    const/4 v2, -0x1

    .line 17
    iget v3, v0, La/l6k0;->c:I

    .line 18
    .line 19
    if-eq v3, v2, :cond_0

    .line 20
    .line 21
    :goto_0
    move/from16 v18, v3

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget v3, v1, La/y5k0;->s:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v19, 0x0

    .line 28
    .line 29
    const v20, 0x18ffff

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    iget-object v0, v0, La/l6k0;->a:Ljava/lang/String;

    .line 47
    .line 48
    move-object/from16 v16, v0

    .line 49
    .line 50
    invoke-static/range {v1 .. v20}, La/y5k0;->a(La/y5k0;Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;La/m6k0;ZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZI)La/y5k0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method
