.class public final La/x4h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y4h;


# direct methods
.method public synthetic constructor <init>(La/y4h;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x4h;->a:B

    iput-object p1, p0, La/x4h;->b:La/y4h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x4h;->a:B

    iget-object p0, p0, La/x4h;->b:La/y4h;

    return-object p0
.end method
