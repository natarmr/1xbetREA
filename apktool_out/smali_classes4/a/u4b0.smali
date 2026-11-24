.class public final La/u4b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w4b0;


# direct methods
.method public synthetic constructor <init>(La/w4b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u4b0;->a:B

    iput-object p1, p0, La/u4b0;->b:La/w4b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u4b0;->a:B

    iget-object p0, p0, La/u4b0;->b:La/w4b0;

    return-object p0
.end method
